package chapter15.stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i = 0;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket();
        try {
            InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
