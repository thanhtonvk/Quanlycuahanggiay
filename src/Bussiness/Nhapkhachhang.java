package Bussiness;

import DataAccess.Congtacvien;
import DataAccess.Khachhang;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Nhapkhachhang {
    public static ArrayList<Khachhang> khachhangs=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Them()
    {

        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|               Nhập thông tin khách hàng                       |");
        System.out.println(" ---------------------------------------------------------------");
        System.out.print("|           Nhập mã khách hàng: ");
        String Makh=sc.nextLine();
        System.out.print("|           Nhập tên khách hàng: ");
        String Tenkh=sc.nextLine();
        System.out.print("|           Nhập giới tính: ");
        String Gioitinh=sc.nextLine();
        System.out.print("|           Nhập cấp độ: ");
        int Capdo=Integer.parseInt(sc.nextLine());
        System.out.print("|           Nhập số điện thoại: ");
        String Sdt=sc.nextLine();
        System.out.println(" ---------------------------------------------------------------");
        Khachhang kh=new Khachhang(Makh,Tenkh,Gioitinh,Capdo,Sdt);
        khachhangs.add(kh);
    }
    public static void Hien1kh(Khachhang kh)
    {
        System.out.printf("%25s|%20s|%15s|%10s|%20s\n",kh.getMakh(),kh.getTenkh(),kh.getGioitinh(),kh.getCapdo(),kh.getSdt());
    }
    public static void HienAll()
    {
        System.out.printf("%25s|%20s|%15s|%10s|%20s\n","Ma khach hang","Ten khach hang","Gioi tinh","Cap do","So dien thoai");
        for (Khachhang kh:
             khachhangs) {
            Hien1kh(kh);
        }
    }
    public static void Sua(String ma)
    {
        for (Khachhang kh:
             khachhangs) {
            if(ma.equalsIgnoreCase(kh.getMakh())||ma.indexOf(kh.getTenkh())>=0)
            {
                System.out.print("Sửa mã khách hàng: ");
                kh.setMakh(sc.nextLine());
                System.out.print("Sửa tên khách hàng: ");
                kh.setTenkh(sc.nextLine());
                System.out.print("Sửa giới tính khách hàng: ");
                kh.setGioitinh(sc.nextLine());
                System.out.print("Sửa cấp độ khách hàng: ");
                kh.setCapdo(Integer.parseInt(sc.nextLine()));
                System.out.print("Sửa số điện thoại khách hàng: ");
                kh.setSdt(sc.nextLine());
            }
        }
    }
    public static void Xoa(String ma)
    {
        for (int i=0;i<khachhangs.size();i++)
        {
            if(ma.equalsIgnoreCase(khachhangs.get(i).getMakh()))
            {
                khachhangs.remove(i);
                System.out.println("Xóa thành công");
            }
        }
    }
    public static void Tim(String ten)
    {
        for (Khachhang kh:
             khachhangs) {
            if(kh.getMakh().equalsIgnoreCase(ten)||kh.getTenkh().indexOf(ten)>=0)
            {
                Hien1kh(kh);
            }
        }
    }
    public static void Luufile() throws IOException {
        File file = new File("Khachhang.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(Khachhang kh:khachhangs)
        {
            fileOutputStream.write(kh.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();
    }

    public static void Docfile()
    {
        try {
            File file = new File("Khachhang.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                //makh+"#"+tenkh+"#"+gioitinh+"#"+capdo+"#"+sdt;
                String makh= line.split("#")[0];
                String tenkh=line.split("#")[1];
                String gioitinh=line.split("#")[2];
                int capdo=Integer.parseInt(line.split("#")[3]);
                String sdt=line.split("#")[4];
                Khachhang kh=new Khachhang(makh,tenkh,gioitinh,capdo,sdt);
                khachhangs.add(kh);
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
