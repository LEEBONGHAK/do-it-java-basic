package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        int i = 0;
        try {
            fileInputStream = new FileInputStream("input.txt");

            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException | NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
