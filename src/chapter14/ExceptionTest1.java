package chapter14;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest1 {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("a.txt");) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
