package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
