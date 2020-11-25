package View;

import Bussiness.*;
import DataAccess.Nhanvien;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static Scanner sc=new Scanner(System.in);
    public static void Ghiallfile() throws IOException {
        Nhapcongtacvien.Luufile();
        Nhapgiay.Luufile();
        Nhapkhachhang.Luufile();
        Nhapnhanvien.Luufile();
        Nhapquanly.Luufile();
    }
    public static void Docallfile()
    {
        Nhapquanly.Docfile();
        Nhapcongtacvien.Docfile();
        Nhapgiay.Docfile();
        Nhapkhachhang.Docfile();
        Nhapnhanvien.Docfile();
    }
    public static int Menu()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|         1. Quản lý cộng tác viên             |");
        System.out.println("|         2. Quản lý giầy                      |");
        System.out.println("|         3. Quản lý khách hàng                |");
        System.out.println("|         4. Quản lý nhân viên                 |");
        System.out.println("|         5. Quản lý người quản lý             |");
        System.out.println("|         6. Thoát                             |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>6);
        return n;
    }
    public static int Menu1()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm cộng tác viên             |");
        System.out.println("|            2. Hiện cộng tác viên             |");
        System.out.println("|            3. Tìm cộng tác viên              |");
        System.out.println("|            4. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>4);
        return n;
    }
    public static int Menu2()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm giầy                      |");
        System.out.println("|            2. Hiện giầy                      |");
        System.out.println("|            3. Tìm kiếm giầy                  |");
        System.out.println("|            4. Xóa giầy                       |");
        System.out.println("|            5. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>5);
        return n;
    }
    public static int Menu3()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm khách hàng                |");
        System.out.println("|            2. Hiện khách hàng                |");
        System.out.println("|            3. Tìm khách hàng                 |");
        System.out.println("|            4. Xóa khách hàng                 |");
        System.out.println("|            5. Sửa thông tin khách            |");
        System.out.println("|            6. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>6);
        return n;
    }
    public static int Menu4()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm nhân viên                 |");
        System.out.println("|            2. Hiện nhân viên                 |");
        System.out.println("|            3. Tìm nhân viên                  |");
        System.out.println("|            4. Xóa nhân viên                  |");
        System.out.println("|            5. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>5);
        return n;
    }
    public static int Menu5()
    {
        System.out.println(" ----------------------------------------------");
        System.out.println("|            1. Thêm quản lý                   |");
        System.out.println("|            2. Hiện quản lý                   |");
        System.out.println("|            3. Xóa quản lý                    |");
        System.out.println("|            4. Quay lại                       |");
        System.out.println(" ----------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(sc.nextLine());
        }while (n<1||n>4);
        return n;
    }
    public static void Run() throws IOException {
        int chon;
        do {
            chon=Menu();
            switch (chon)
            {
                case 1:
                    do {
                        chon=Menu1();
                        switch (chon)
                        {
                            case 1:
                                Nhapcongtacvien.Them();
                                break;
                            case 2:
                                Nhapcongtacvien.Hienall();
                                sc.nextLine();
                                break;
                            case 3:
                                String ten=sc.nextLine();
                                Nhapcongtacvien.Tim(ten);
                                sc.nextLine();
                                break;
                        }
                    }while (chon>=1&&chon<=3);
                    break;
                case 2:
                    do {
                        chon=Menu2();
                        switch (chon)
                        {
                            case 1:
                                Nhapgiay.Them();
                                break;
                            case 2:
                                Nhapgiay.HienAll();
                                sc.nextLine();
                                break;
                            case 3:
                                String ten=sc.nextLine();
                                Nhapgiay.Tim(ten);
                                sc.nextLine();
                                break;
                            case 4:
                                String ma=sc.nextLine();
                                Nhapgiay.Xoa(ma);
                                sc.nextLine();
                                break;
                        }
                    }while (chon>=1&&chon<=4);
                    break;
                case 3:
                    do {
                        chon=Menu3();
                        switch (chon)
                        {
                            case 1:
                                Nhapkhachhang.Them();
                                break;
                            case 2:
                                Nhapkhachhang.HienAll();
                                sc.nextLine();
                                break;
                            case 3:
                                String mas=sc.nextLine();
                                Nhapkhachhang.Sua(mas);
                                break;
                            case 4:
                                String tens=sc.nextLine();
                                Nhapkhachhang.Tim(tens);
                                sc.nextLine();
                                break;
                            case 5:
                                String ma=sc.nextLine();
                                Nhapkhachhang.Xoa(ma);
                                sc.nextLine();
                                break;
                        }
                    }while (chon>=1&&chon<=5);
                    break;
                case 4:
                    do {
                        chon=Menu4();
                        switch (chon)
                        {
                            case 1:
                                Nhapnhanvien.Them();
                                break;
                            case 2:
                                Nhapnhanvien.HienAll();
                                sc.nextLine();
                                break;
                            case 3:
                                String ten=sc.nextLine();
                                Nhapnhanvien.Tim(ten);
                                sc.nextLine();
                                break;
                            case 4:
                                String ma=sc.nextLine();
                                Nhapnhanvien.Xoa(ma);
                                sc.nextLine();
                                break;
                        }
                    }while (chon>=1&&chon<=4);
                    break;
                case 5:
                    do {
                        chon=Menu5();
                        switch (chon)
                        {
                            case 1:
                                Nhapquanly.Them();
                                break;
                            case 2:
                                Nhapquanly.Hien();
                                sc.nextLine();
                                break;
                            case 3:
                                String ma=sc.nextLine();
                                Nhapquanly.Xoa(ma);
                                sc.nextLine();
                                break;
                        }
                    }while (chon>=1&&chon<=3);
                    break;
                case 6:
                    Ghiallfile();
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public static void main(String[] args) throws IOException {
        Docallfile();
        Run();
    }
}
