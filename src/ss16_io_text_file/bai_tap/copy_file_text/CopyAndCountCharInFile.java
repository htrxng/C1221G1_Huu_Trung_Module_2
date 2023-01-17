package ss16_io_text_file.bai_tap.copy_file_text;

import java.util.List;

public class CopyAndCountCharInFile {

    public static int countChar(List<String> copyFile) {
        int count = 0;
        StringBuilder copyFileString = new StringBuilder();
        for (String s : copyFile) {
            copyFileString.append(s);
        }
        for (int i = 0; i < copyFileString.length(); i++) {
            if (!Character.isSpace(copyFileString.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> copyFile = readAndWriteFile.readFile("D:\\CodeGym\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\rootfile");
        int count = countChar(copyFile);
        readAndWriteFile.writeFile("D:\\CodeGym\\module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\copyfile", copyFile, count);
    }
}
