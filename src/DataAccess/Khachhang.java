package DataAccess;

public class Khachhang {
    private String makh;
    private String tenkh;
    private String gioitinh;
    private int capdo;
    private String sdt;

    @Override
    public String toString() {
        return makh+"#"+tenkh+"#"+gioitinh+"#"+capdo+"#"+sdt;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getCapdo() {
        return capdo;
    }

    public void setCapdo(int capdo) {
        this.capdo = capdo;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Khachhang(String makh, String tenkh, String gioitinh, int capdo, String sdt) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.capdo = capdo;
        this.sdt = sdt;
    }
}
