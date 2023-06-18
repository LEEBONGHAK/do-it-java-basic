package chapter15.stream.inputstream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("Please input a alphabet");
        int i = 0;
        try {
            i = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(i);

        System.out.println("Please input alphabets");
        try {
            while((i = System.in.read()) != '\n') {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
