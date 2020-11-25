package DataAccess;

public class Nhanvien {
    private String Manv;
    private String Tennv;
    private String Sdt;

    @Override
    public String toString() {
        return Manv+"#"+Tennv+"#"+Sdt;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String manv) {
        Manv = manv;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String tennv) {
        Tennv = tennv;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public Nhanvien(String manv, String tennv, String sdt) {
        Manv = manv;
        Tennv = tennv;
        Sdt = sdt;
    }
}
