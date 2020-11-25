package DataAccess;

public class Congtacvien {
    private String hoten;
    private String diachi;
    private String sdt;
    private int chieukhau;
    private String link;

    @Override
    public String toString() {
        return hoten+"#"+diachi+"#"+sdt+"#"+chieukhau+"#"+link;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getChieukhau() {
        return chieukhau;
    }

    public void setChieukhau(int chieukhau) {
        this.chieukhau = chieukhau;
    }

    public Congtacvien(String hoten, String diachi, String sdt, int chieukhau, String link) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.chieukhau = chieukhau;
        this.link = link;
    }
}
