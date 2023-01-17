package ss6_inheritance.bai_tap.circle_cylinder_class.demo_ke_thua;

public abstract class VoThuat {
    protected String ten;
    protected String nguonGoc;
    protected String sangTo;
    protected String voDao;

    public abstract void gioiThieu();

    public VoThuat(String ten, String nguonGoc, String sangTo, String voDao) {
        this.ten = ten;
        this.nguonGoc = nguonGoc;
        this.sangTo = sangTo;
        this.voDao = voDao;
        gioiThieu();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getSangTo() {
        return sangTo;
    }

    public void setSangTo(String sangTo) {
        this.sangTo = sangTo;
    }

    public String getVoDao() {
        return voDao;
    }

    public void setVoDao(String voDao) {
        this.voDao = voDao;
    }
}
