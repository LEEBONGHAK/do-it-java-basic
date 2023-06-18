package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream2 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("input2.txt")) {
            byte[] bytes = new byte[10];
            int i;

            while ((i = fileInputStream.read(bytes)) != -1) {
                for (int j = 0; j < i; j++) {
                    System.out.print((char) bytes[j]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
