package Bussiness;

import DataAccess.Congtacvien;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Nhapcongtacvien {
    public static ArrayList<Congtacvien> congtacviens=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Them()
    {
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|                    Nhập cộng tác viên                         |");
        System.out.println(" ---------------------------------------------------------------");
        System.out.print("|           Nhập họ tên: ");
        String hoten= sc.nextLine();
        System.out.print("|           Nhập địa chỉ: ");
        String diachi=sc.nextLine();
        System.out.print("|           Nhập số điện thoại: ");
        String sdt=sc.nextLine();
        System.out.print("|           % được chiết khấu: ");
        int chietkhau=Integer.parseInt(sc.nextLine());
        System.out.print("|           Nhap link facebook hoac zalo: ");
        String link=sc.nextLine();
        System.out.println(" ---------------------------------------------------------------");
        Congtacvien ctv=new Congtacvien(hoten,diachi,sdt,chietkhau,link);
        congtacviens.add(ctv);
    }
    public static void Hien1ctv(Congtacvien ctv)
    {
        System.out.printf("%20s|%30s|%20s|%15s|%50s\n",ctv.getHoten(),ctv.getDiachi(),ctv.getSdt(),ctv.getChieukhau(),ctv.getLink());
    }
    public static void Hienall()
    {
        System.out.printf("%20s|%30s|%20s|%15s|%50s\n","Họ tên","Địa chỉ","Số điện thoại","Chiết khấu","Link");
        for (Congtacvien ctv:
             congtacviens) {
            Hien1ctv(ctv);
        }
    }
    public static void Tim(String ten)
    {
        System.out.printf("%20s|%30s|%20s|%15s|%50s\n","Họ tên","Địa chỉ","Số điện thoại","Chiết khấu","Link");
        for (Congtacvien ctv:
             congtacviens) {
            if(ten.toUpperCase().indexOf(ctv.getHoten().toUpperCase())>=0)
            {
                Hien1ctv(ctv);
            }
        }
    }
    public static void Luufile() throws IOException {
        File file = new File("Congtacvien.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(Congtacvien ctv:congtacviens)
        {
            fileOutputStream.write(ctv.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();
    }
    public static void Docfile()
    {
        try {
            File file = new File("Congtacvien.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                //hoten+"#"+diachi+"#"+sdt+"#"+chieukhau+"#"+link;
                String hoten= line.split("#")[0];
                String diachi=line.split("#")[1];
                String sdt=line.split("#")[2];
                int chetkhau=Integer.parseInt(line.split("#")[3]);
                String link=line.split("#")[4];
                Congtacvien ctv=new Congtacvien(hoten,diachi,sdt,chetkhau,link);
                congtacviens.add(ctv);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
