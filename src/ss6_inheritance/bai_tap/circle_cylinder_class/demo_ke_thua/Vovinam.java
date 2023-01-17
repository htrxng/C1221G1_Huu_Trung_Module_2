package ss6_inheritance.bai_tap.circle_cylinder_class.demo_ke_thua;

public class Vovinam extends VoThuat implements Quyen {

    public Vovinam(String ten, String nguonGoc, String sangTo, String voDao)
    {
        super(ten, nguonGoc, sangTo, voDao);
    }

    @Override
    public void gioiThieu() {
        System.out.println(super.ten + " được tạo ra bởi " + super.sangTo + " ở " + super.nguonGoc);
    }

    @Override
    public void dam() {
        System.out.println("đấm thẳng");
    }

    @Override
    public void da() {
        System.out.println("đá tạt");
    }

    @Override
    public void gat() {
        System.out.println("gạt số 1");
    }

    @Override
    public void ne(int a) {

    }

    @Override
    public void ne() {
        System.out.println("né ngang");
    }

    @Override
    public void diQuyen() {
        System.out.println("Thập tự quyền, khai quyền!");
        dam();
        da();
        gat();
        ne();
        dam();
        da();
        gat();
        ne();
        dam();
        da();
        gat();
        ne();
        dam();
        da();
        gat();
        ne();
    }
}

