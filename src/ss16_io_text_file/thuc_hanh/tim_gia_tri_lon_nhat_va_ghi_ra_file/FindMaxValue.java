package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\module2\\src\\ss16_io_text_file\\thuc_hanh\\tinh_tong_cac_so_trong_file_text\\TH2");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CodeGym\\module2\\src\\ss16_io_text_file\\thuc_hanh\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\result.txt", maxValue);
    }
}
