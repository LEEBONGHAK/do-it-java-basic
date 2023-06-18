package chapter15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("writer.txt")) {
            fileWriter.write("A");
            char[] ch = { 'B', 'C', 'D' };
            fileWriter.write(ch);
            fileWriter.write("안녕하세요");
            fileWriter.write(ch, 1, 2);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
