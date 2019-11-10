package tugastugas;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class TestBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jmlbuku = 3;
        int jmlfiksi=0;
        int nonfiksi=0;
        int halfiksi=0;
        int halnonfiksi=0;
        double ragamfiksi=0;
        double ragamnonfiksi=0;
        int list;
        Random r = new Random();
        buku[] buku = new buku[100000];
        
        for(int i=0; i<jmlbuku; i++){
            list = r.nextInt(2)+1;
            
            if(list == 1){
                buku[i] = new fiksi(("buku_"+(i+1)), "A Fuadi", 100);
                jmlfiksi+=1;
                halfiksi += buku[i].getJmlHalaman();
                ragamfiksi += Math.pow((buku[i].getJmlHalaman()-rata(halfiksi,jmlfiksi)),2);
            }
            
            else{
                buku[i]= new nonFiksi(("buku_"+(i+1)),"A Fuadi", 100);
                nonfiksi+=1;
                halnonfiksi+=buku[i].getJmlHalaman();
                ragamnonfiksi += Math.pow((buku[i].getJmlHalaman()-rata(halnonfiksi,nonfiksi)),2);
            }
            buku[i].info();
            System.out.println("");
        }
        double ragamf = ragamfiksi/jmlfiksi;
        double ragamnf = ragamnonfiksi/nonfiksi;
        int halbuku = halfiksi+halnonfiksi;
            System.out.println("fiksi : "+jmlfiksi);
            System.out.println("nonfiksi : "+nonfiksi);
            System.out.println("halaman seluruh buku : "+halbuku);
            System.out.println("hal fiksi : "+halfiksi);
            System.out.println("hal non fiksi : "+halnonfiksi);
            
        for(int n=0; n<buku.length; n++){
        tepi();
        header("PERPUSTAKAAN.txt");
        tepi();
        System.out.println("1) input buku baru\n2) modifikasi detail buku"
        + "\n3) hapus buku\n0) EXIT");
        System.out.print("pilih: ");
        int pilih = input.nextInt();
        switch(pilih){
            
            case 1:
                tepi();
                header("BukuBaru.txt");
                tepi();
                try{
                    System.out.println("input judul buku:\n>");
                    String judul = input.next();
                    System.out.println("input pengarang buku:\n>");
                    String pengarang = input.next();
                    System.out.println("input jumlah halaman\n>");
                    int hlm = input.nextInt();
                    
                    System.out.println("pilih jenis: \n1. fiksi\n2. non fiksi");
                    System.out.println("pilih: ");
                    int a = input.nextInt();
                    
                    switch(a){
                    case 1:
                        buku[jmlbuku] = new fiksi(judul,pengarang,hlm);
                        jmlfiksi+=1;
                        jmlbuku +=1;
                        halfiksi +=hlm;
                        ragamfiksi += Math.pow((buku[jmlbuku].getJmlHalaman()-rata(halfiksi,jmlfiksi)),2);
                        break;
                    case 2:
                        buku[jmlbuku] = new nonFiksi(judul,pengarang,hlm);
                        nonfiksi+=1;
                        jmlbuku +=1;
                        halnonfiksi+=hlm;
                        ragamnonfiksi += Math.pow((buku[jmlbuku].getJmlHalaman()-rata(halnonfiksi,nonfiksi)),2);
                        break;
                    }
                
                }
                catch(Exception e){
                    
                }
                break;
            case 2:
                tepi();
                header("UbahBuku.txt");
                tepi();
                System.out.println("pilih buku yang akan diubah:");
                for(int i=0; i<jmlbuku; i++){
                    System.out.println((i+1)+". "+buku[i].getJudulBuku()+" | "+buku[i].getPengarang());
                }
                System.out.println("pilih: ");
                int p = input.nextInt();
                
                switch(p){
                    case 1:
                        try{
                            System.out.println("input judul buku:\n>");
                            String judul = input.next();
                            System.out.println("input pengarang buku:\n>");
                            String pengarang = input.next();
                            System.out.println("input jumlah halaman\n>");
                            int hal = input.nextInt();
                            
                            if(buku[0].getJenis()=="fiksi"){
                                buku[0] = new fiksi(judul,pengarang,hal);
                                buku[0].setJmlHalaman(hal);
                            }else{
                                buku[0] = new nonFiksi(judul,pengarang,hal);
                                buku[0].setJmlHalaman(hal);
                            }
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                    case 2:
                        try{
                            System.out.println("input judul buku:\n>");
                            String judul = input.next();
                            System.out.println("input pengarang buku:\n>");
                            String pengarang = input.next();
                            System.out.println("input jumlah halaman\n>");
                            int hal = input.nextInt();
                            
                            if(buku[1].getJenis()=="fiksi"){
                                buku[1] = new fiksi(judul,pengarang,hal);
                                buku[1].setJmlHalaman(hal);
                            }else{
                                buku[1] = new nonFiksi(judul,pengarang,hal);
                                buku[1].setJmlHalaman(hal);
                            }
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                    case 3:
                        try{
                            System.out.println("input judul buku:\n>");
                            String judul = input.next();
                            System.out.println("input pengarang buku:\n>");
                            String pengarang = input.next();
                            System.out.println("input jumlah halaman\n>");
                            int hal = input.nextInt();
                            
                            if(buku[2].getJenis()=="fiksi"){
                                buku[2] = new fiksi(judul,pengarang,hal);
                                buku[2].setJmlHalaman(hal);
                            }else{
                                buku[2] = new nonFiksi(judul,pengarang,hal);
                                buku[2].setJmlHalaman(hal);
                            }
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                }
                break;
            case 3:
                tepi();
                header("HapusBuku.txt");
                tepi();
                System.out.println("pilih buku yang akan dihapus:");
                for(int i=0; i<jmlbuku; i++){
                    System.out.println((1+i)+". "+buku[i].getJudulBuku()+" | "+buku[i].getPengarang());
                }
                System.out.print("pilih: ");
                int pil = input.nextInt();
                switch(pil){
                    case 1:
                        try{
                        for(int i=1; i<jmlbuku; i++){
                            buku[i-1]=buku[i];
                            buku[i].info();
                            System.out.println("");
                        }
                        if(buku[0].getJenis()=="fiksi"){
                            jmlfiksi-=1;
                            buku[0].setJmlHalaman(0);
                        }else{
                            nonfiksi-=1;
                            buku[0].setJmlHalaman(0);
                        }
                        jmlbuku-=1;
                        }
                        catch(Exception e){
                            System.out.println("salah");
                        }
                        break;
                    case 2:
                        try{
                        for(int i=2; i<jmlbuku; i++){
                            buku[i-1]=buku[i];
                            buku[i].info();
                            System.out.println("");
                        }
                        if(buku[1].getJenis()=="fiksi"){
                            jmlfiksi-=1;
                            buku[1].setJmlHalaman(0);
                        }else{
                            nonfiksi-=1;
                            buku[1].setJmlHalaman(0);
                        }
                        jmlbuku-=1;
                        }
                        catch(Exception e){
                            
                        }
                        break;
                    case 3:
                        try{
                        for(int i=0; i<jmlbuku-1; i++){
                            buku[i].info();
                            System.out.println("");
                            
                        }
                        if(buku[2].getJenis()=="fiksi"){
                            jmlfiksi -=1;
                            buku[2].setJmlHalaman(0);
                        }else{
                            nonfiksi-=1;
                            buku[2].setJmlHalaman(0);
                        }
                        jmlbuku-=1;
                        }
                        catch(Exception e){
                            
                        }
                        break;
                }
            case 0:
                tepi();
                header("PERPUSTAKAAN.txt");
                tepi();
                double x=0;
                for(int i=0; i<jmlbuku; i++){
                    buku[i].info();
                    System.out.println("");
                    x += Math.pow((buku[i].getJmlHalaman()-rata(halbuku,jmlbuku)),2);
                }
                double ragambuku = x/jmlbuku;
                tepi();
                System.out.println("jumlah buku dalam perpustakaan : "+jmlbuku);
                System.out.println("rata rata halaman buku dalam perpustakaan : "+rata(halbuku,jmlbuku));
                System.out.println("standar deviasi halam buku dalam perpustakaan : "+standardeviasi(ragambuku));
                tepi();
                System.out.println("jumlah buku fiksi dalam perpustakaan : "+jmlfiksi);
                System.out.println("rata rata halaman buku fiksi dalam perpustakaan : "+rata(halfiksi,jmlfiksi));
                System.out.println("standar deviasi halaman buku fiksi dalam perpustakaan : "+standardeviasi(ragamf));
                tepi();
                System.out.println("jumlah buku nonfiksi dalam perpustakaan : "+nonfiksi);
                System.out.println("rata-rata buku nonfiksi dalam perpustakaan : "+rata(halnonfiksi,nonfiksi));
                System.out.println("standar deviasi buku nonfiksi dalam perpustakaan : "+ standardeviasi(ragamnf));
                tepi();
                String path = "data.txt";
                try{
                    FileWriter file = new FileWriter(path);
                        BufferedWriter buf = new BufferedWriter(file);
                        buf.write("PERPUSTAKAAN");
                        buf.newLine();
                        buf.newLine();
                        for(int i=0; i<jmlbuku; i++){
                            int a = i+1;
                            buf.write("buku ke : ["+Integer.toString(a)+"]");
                            buf.newLine();
                            buf.write("judul : "+buku[i].getJudulBuku());
                            buf.newLine();
                            buf.write("pengarang : "+buku[i].getPengarang());
                            buf.newLine();
                            buf.write("jumlah halaman : "+ buku[i].getJmlHalaman());
                            buf.newLine();
                            buf.write("jenis buku : "+ buku[i].getJenis());
                            buf.newLine();
                            buf.newLine();
                        }
                        buf.close();
                    }
                    catch(Exception e){
                    }
                System.exit(0);
                break;
            }
        }
    }    
    public static void header(String fileTxt){
        File tampil = new File(fileTxt);
        String encoding = "utf-8";
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(tampil), encoding)){
            int data = isr.read();
            while (data != -1){
                System.out.print((char)data);
                data = isr.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void tepi(){
        System.out.println("\n=======================================================");
    }
    public static double rata(int jumlahdata, int ndata){
        double rata=0;
        if(ndata == 0){
            System.out.print("");
        }else{
            rata = jumlahdata/ndata;
        }
        return rata;
    }
    public static double standardeviasi(double ragam){
        double standev=0;
        if(ragam==0){
            System.out.print("");
        }else{
            standev = Math.sqrt(ragam);
        }
        return standev;
    }
}

    