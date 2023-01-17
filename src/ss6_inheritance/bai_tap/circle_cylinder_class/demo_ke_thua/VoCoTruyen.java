package demo_ke_thua;

import ss6_inheritance.bai_tap.circle_cylinder_class.demo_ke_thua.Quyen;
import ss6_inheritance.bai_tap.circle_cylinder_class.demo_ke_thua.VoThuat;

public class VoCoTruyen  extends VoThuat implements Quyen {
    public VoCoTruyen(String ten, String nguonGoc, String sangTo, String voDao) {
        super(ten, nguonGoc, sangTo, voDao);
    }

    @Override
    public void diQuyen() {
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

    @Override
    public void gat() {
        System.out.println("gạt trên, gạt dưới");
    }

    @Override
    public void ne(int a) {

    }

    @Override
    public void ne() {
        System.out.println("né trên, né dưới");

    }

    @Override
    public void dam() {
        System.out.println("đấm móc, đấm lao");
    }

    @Override
    public void da() {
        System.out.println("Đá đạp, đá thẳng");
    }

    @Override
    public void gioiThieu() {
        System.out.println(super.ten + " được tạo ra bởi " + super.sangTo + " ở " + super.nguonGoc);
    }
}
