package DataAccess;

public class Thongtingiay {
    private String magiay;
    private String tengiay;
    private int soluong;
    private double gianhap,giaban;
    private int size;

    @Override
    public String toString() {
        return magiay+"#"+tengiay+"#"+soluong+"#"+gianhap+"#"+giaban+size;
    }

    public String getMagiay() {
        return magiay;
    }

    public void setMagiay(String magiay) {
        this.magiay = magiay;
    }

    public String getTengiay() {
        return tengiay;
    }

    public void setTengiay(String tengiay) {
        this.tengiay = tengiay;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Thongtingiay(String magiay, String tengiay, int soluong, double gianhap, double giaban, int size) {
        this.magiay = magiay;
        this.tengiay = tengiay;
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.size = size;
    }
}
