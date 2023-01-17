package he_thong_quan_li_sinh_vien.utils;

import he_thong_quan_li_sinh_vien.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteFile {

    public static void writeFileStudent(String filePath, List<Student> list) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Student student : list) {
                bufferedWriter.write(student.getInformationToCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("file does not exist!");
            e.printStackTrace();
        }
    }
    public static List<Student> readFileStudent(String filePath) {
        List<Student> studentList = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr;
            while ((line = br.readLine()) != null) {
                arr = line.split(",");
//    public Student(int code, String name, String birthday, String gender, String phoneNumber, int classCode) {
                studentList.add(new Student(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5])));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
        return studentList;
    }
}
