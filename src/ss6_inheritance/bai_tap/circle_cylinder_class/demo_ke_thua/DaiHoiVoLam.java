package ss6_inheritance.bai_tap.circle_cylinder_class.demo_ke_thua;

public class DaiHoiVoLam {
    public static void main(String[] args) {
        System.out.println("Xin mời đại diện đến từ Vovinam: ");
        Vovinam vovinam = new Vovinam("Vovinam","Việt Nam","Nguyễn Lộc",
                "Quan niệm thông thường của người tập võ là để tự vệ. VVÐS tập võ cho thân thể khoẻ mạnh, " +
                        "trí tuệ minh mẩn, tâm hồn cao thượng để học tập, lao động, bảo vệ sự sống, đấu tranh cho lẽ" +
                        " phải và phục vụ tổ quốc. ");
        System.out.println(vovinam.getVoDao());
        System.out.println("-----------------------------------------------");
        System.out.println("Xin mời đại diện đến từ Võ Cổ Truyền: ");
        demo_ke_thua.VoCoTruyen voCoTruyen = new demo_ke_thua.VoCoTruyen("Võ Cổ Truyền","Việt Nam", "Người xưa",
                "Mục đích chân chính của võ thuật lại không phải như thế. Vì võ thuật cổ truyền Việt Nam sinh " +
                        "ra trong cái nôi triết lý uyên thâm của Nho – Phật – Lão suốt mấy nghìn năm, nên mục đích chân" +
                        " chính của nó chính là giúp con người rèn luyện thể chất một cách thích hợp để bản thân có thể " +
                        "đạt đến sự thăng hoa tối thượng về tinh thần, qua võ mà đạt Đạo, cũng tức là “võ Đạo”.");
        System.out.println(voCoTruyen.getVoDao());
        System.out.println("-------------------------Tỉ thí võ công--------------------------------");
        vovinam.dam();
        voCoTruyen.ne();
        vovinam.da();
        voCoTruyen.ne();
        vovinam.dam();
        voCoTruyen.gat();
        vovinam.dam();
        voCoTruyen.ne();
        vovinam.da();
        voCoTruyen.ne();
        vovinam.dam();
        voCoTruyen.gat();
        vovinam.dam();
        voCoTruyen.ne();
        vovinam.da();
        voCoTruyen.ne();
        vovinam.dam();
        voCoTruyen.gat();
        vovinam.dam();
        voCoTruyen.ne();
        vovinam.da();
        voCoTruyen.ne();
        vovinam.dam();
        voCoTruyen.gat();
        System.out.println("Đại hội võ lâm kết thúc, xin chúc mừng Tân Minh chủ là Ngọc Luật Đại Vương đến từ Quảng Nôm!");
    }
}
