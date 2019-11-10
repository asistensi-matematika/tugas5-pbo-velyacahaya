package tugastugas;
public class Perpustakaan{
    
}
class buku extends Perpustakaan{
    private String judulBuku, pengarang, jenis;
    private int jmlHalaman;
    
    public buku(){
        this.judulBuku = "default";
        this.pengarang = "default";

        this.jmlHalaman = 0;
    }
    public buku(String jd, String p, int hal){
        this.judulBuku = jd;
        this.pengarang = p;
        this.jmlHalaman = hal;
    }
    public buku(String jd, String p, int hal, String jn){
        this.judulBuku = jd;
        this.pengarang = p;
        this.jmlHalaman = hal;
        this.jenis = jn;
    }

    public String getJudulBuku() {
        return this.judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getJmlHalaman() {
        return this.jmlHalaman;
    }

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }
    public String getJenis(){
        return this.jenis;
    }
    public void info(){
        System.out.println("Judul Buku\t: "+getJudulBuku()+"\nPengarang\t: "
        +getPengarang()+"\nJumlah Halaman\t: "+getJmlHalaman());
    }
}
class fiksi extends buku{
    private String jenis;
    public fiksi(){
        super();
        this.jenis = "fiksi";
    }
    public fiksi(String jd, String p, int hal){
        super(jd, p, hal);
        this.jenis = "fiksi";
    }

    public void setJudulBuku(String judulBuku) {
        super.setJudulBuku(judulBuku);
    }
    public String getJudulBuku(){
        return super.getJudulBuku();
    }
    public void setJmlHalaman(int hal){
        super.setJmlHalaman(hal);
    }
    public int getJmlHalaman(){
        return super.getJmlHalaman();
    }
    public String getJenis(){
        return this.jenis;
    }
    public void info(){
        super.info();
        System.out.println("Jenis Buku\t: "+ this.jenis);
    }
}
class nonFiksi extends buku{
    private String jenis;
    public nonFiksi(){
        super();
        this.jenis = "non fiksi";
    }
    public nonFiksi(String jd, String p, int hal){
        super(jd, p, hal);
        this.jenis = "non fiksi";
    }

    public void setJudulBuku(String jb){
        super.setJudulBuku(jb);
    }
    public String getJudulBuku(){
        return super.getJudulBuku();
    }
    public void setJmlHalaman(int hal){
        super.setJmlHalaman(hal);
    }
    public int getJmlHalaman(){
        return super.getJmlHalaman();
    }
    public String getJenis(){
        return this.jenis;
    }
    public void info(){
        super.info();
        System.out.println("Jenis Buku\t: "+ this.jenis);
    }
}