package Bussiness;

import DataAccess.Khachhang;
import DataAccess.Nhanvien;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Nhapnhanvien {
    public static ArrayList<Nhanvien> nhanviens=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Them()
    {
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|               Nhập thông tin khách hàng                       |");
        System.out.println(" ---------------------------------------------------------------");
        System.out.print("|          Nhập mã nhân viên: ");
        String Manv=sc.nextLine();
        System.out.print("|          Nhập tên nhân viên: ");
        String Tennv=sc.nextLine();
        System.out.print("|          Nhập số điện thoại: ");
        String Sdt=sc.nextLine();
        System.out.println(" ---------------------------------------------------------------");
        Nhanvien nv=new Nhanvien(Manv,Tennv,Sdt);
        nhanviens.add(nv);
    }
    public static void Hien1nv(Nhanvien nv)
    {
        System.out.printf("%20s|%20s|%25s\n",nv.getManv(),nv.getTennv(),nv.getSdt());
    }
    public static void HienAll()
    {
        System.out.printf("%20s|%20s|%25s\n","Mã nhân viên","Tên nhân viên","Số điện thoại");
        for (Nhanvien nv:
             nhanviens) {
            Hien1nv(nv);
        }
    }
    public static void Tim(String ma)
    {
        for (Nhanvien nv:
             nhanviens) {
            if(nv.getManv().equalsIgnoreCase(ma))
            {
                Hien1nv(nv);
            }
        }
    }
    public static void Luufile() throws IOException {
        File file = new File("Nhanvien.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(Nhanvien nv:nhanviens)
        {
            fileOutputStream.write(nv.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();
    }
    public static void Xoa(String ma)
    {
        for (int i = 0; i < nhanviens.size(); i++) {
            if(nhanviens.get(i).getManv().equalsIgnoreCase(ma))
            {
                nhanviens.remove(i);
                System.out.println("Xóa thành công");
            }
        }
    }
    public static void Docfile()
    {
        try {
            File file = new File("Nhanvien.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                //Manv+"#"+Tennv+"#"+Sdt;
                String manv= line.split("#")[0];
                String tennv=line.split("#")[1];
                String sdt=line.split("#")[2];
                Nhanvien nv=new Nhanvien(manv,tennv,sdt);
                nhanviens.add(nv);

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
