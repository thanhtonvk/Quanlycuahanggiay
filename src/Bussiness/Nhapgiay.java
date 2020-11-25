package Bussiness;

import DataAccess.Khachhang;
import DataAccess.Thongtingiay;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Nhapgiay {
    public static ArrayList<Thongtingiay> giays=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void Them()
    {
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|                    Nhập thông tin giầy                        |");
        System.out.println(" ---------------------------------------------------------------");
        System.out.print("|              Nhập mã giầy: ");
        String Magiay=sc.nextLine();
        System.out.print("|              Nhập tên giầy: ");
        String Tengiay=sc.nextLine();
        System.out.print("|              Nhập số lượng: ");
        int Soluong=Integer.parseInt(sc.nextLine());
        System.out.print("|              Nhập giá nhập: ");
        double Gianhap=Double.parseDouble(sc.nextLine());
        System.out.print("|              Nhập giá bán: ");
        double Giaban=Double.parseDouble(sc.nextLine());
        System.out.print("|              Nhập size giầy: ");
        int Size=Integer.parseInt(sc.nextLine());
        System.out.println(" ---------------------------------------------------------------");
        Thongtingiay ttg=new Thongtingiay(Magiay,Tengiay,Soluong,Gianhap,Giaban,Size);
        giays.add(ttg);
    }
    public static void Hien1giay(Thongtingiay giay)
    {
        System.out.printf("%20s|%20s|%15s|%15s|%15s|%10s\n",giay.getMagiay(),giay.getTengiay(),giay.getSoluong(),giay.getGiaban(),giay.getGianhap(),giay.getSize());
    }
    public static void HienAll()
    {
        System.out.printf("%20s|%20s|%15s|%15s|%15s|%10s\n","Ma giay","Ten giay","So luong","Gia ban","Gia nhap","Size");
        for (Thongtingiay ttg:
             giays) {
            Hien1giay(ttg);
        }
    }
    public static void Tim(String ma)
    {
        for (Thongtingiay ttg:
             giays) {
            if(ma.toUpperCase().indexOf(ttg.getTengiay().toUpperCase())>=0||ma.equalsIgnoreCase(ttg.getMagiay()))
                Hien1giay(ttg);
        }
    }
    public static void Xoa(String ma)
    {
        for (int i = 0; i < giays.size(); i++) {
            if(ma.equalsIgnoreCase(giays.get(i).getMagiay()))
            {
                giays.remove(i);
                System.out.println("Xóa thành công");
            }
        }
    }
    public static void Luufile() throws IOException {
        File file = new File("Giay.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(Thongtingiay ttg: giays)
        {
            fileOutputStream.write(ttg.toString().getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();
    }
    public static void Docfile()
    {
        try {
            File file = new File("Giay.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                //magiay+"#"+tengiay+"#"+soluong+"#"+gianhap+"#"+giaban;
                String magiay= line.split("#")[0];
                String tengiay=line.split("#")[1];
                int soluong=Integer.parseInt(line.split("#")[2]);
                double gianhap =Double.parseDouble(line.split("#")[3]);
                double giaban=Double.parseDouble(line.split("#")[4]);
                int size=Integer.parseInt(line.split("#")[5]);
                Thongtingiay ttg=new Thongtingiay(magiay,tengiay,soluong,gianhap,giaban,size);
                giays.add(ttg);
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

