package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath) {
        List<String> copyFile = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                copyFile.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return copyFile;
    }

    public void writeFile(String filePath, List<String> copyFile, int count) {
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String s : copyFile) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.write("tổng kí tự trong file là: " + count);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("File đích không tồn tại!");
            e.printStackTrace();
        }
    }
}
