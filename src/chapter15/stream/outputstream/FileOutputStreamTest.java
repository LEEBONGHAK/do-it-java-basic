package chapter15.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        byte[] bytes = new byte[26];
        byte data = 65;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = data++;
        }

        // 생성자에 true 추가 시 append로 바뀜
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            fileOutputStream.write(65);
            fileOutputStream.write(66);
            fileOutputStream.write(67);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream("output2.txt")) {
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
