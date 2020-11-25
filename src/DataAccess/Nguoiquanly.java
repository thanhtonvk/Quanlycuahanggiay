package DataAccess;

public class Nguoiquanly {
    private String maql;
    private String tenql;
    private String sdt;

    public String getMaql() {
        return maql;
    }

    @Override
    public String toString() {
        return maql+"#"+tenql+"#"+sdt;
    }

    public void setMaql(String maql) {
        this.maql = maql;
    }

    public String getTenql() {
        return tenql;
    }

    public void setTenql(String tenql) {
        this.tenql = tenql;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Nguoiquanly(String maql, String tenql, String sdt) {
        this.maql = maql;
        this.tenql = tenql;
        this.sdt = sdt;
    }
}
