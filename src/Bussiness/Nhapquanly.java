package Bussiness;

import DataAccess.Khachhang;
import DataAccess.Nguoiquanly;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Nhapquanly {
    public static ArrayList<Nguoiquanly> quanlys=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Them()
    {
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|               Nhập thông tin khách hàng                       |");
        System.out.println(" ---------------------------------------------------------------");
        System.out.print("|         Nhập mã quản lý: ");
        String Maql=sc.nextLine();
        System.out.print("|         Nhập tên quản lý: ");
        String Tenql=sc.nextLine();
        System.out.print("|         Nhập số điện thoại: ");
        String Sdt=sc.nextLine();
        System.out.println(" ---------------------------------------------------------------");
        Nguoiquanly ql=new Nguoiquanly(Maql,Tenql,Sdt);
        quanlys.add(ql);
    }
    public static void Hien()
    {
        System.out.printf("%20s|%20s|%25s\n","Ma quan ly","Ten quan ly","So dien thoai");
        for (Nguoiquanly nql:
             quanlys) {
            System.out.printf("%20s|%20s|%25s\n", nql.getMaql(), nql.getTenql(),nql.getSdt());
        }
    }
    public static void Luufile() throws IOException {
        File file = new File("Quanly.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(Nguoiquanly ngl: quanlys)
        {
            fileOutputStream.write(ngl.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();
    }
    public static void Docfile()
    {
        try {
            File file = new File("Quanly.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                //maql+"#"+tenql+"#"+sdt;
                String maql= line.split("#")[0];
                String tenql=line.split("#")[1];
                String sdt=line.split("#")[2];
                Nguoiquanly nql=new Nguoiquanly(maql,tenql,sdt);
                quanlys.add(nql);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Xoa(String Ma)
    {
        for (int i=0;i<quanlys.size();i++)
        {
            if(Ma.equalsIgnoreCase(quanlys.get(i).getMaql()))
            {
                quanlys.remove(i);
                System.out.println("Xóa thành công");
            }
        }
    }
}
