import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 9999);

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        Scanner scanner = new Scanner(System.in);
        String line = "";
        while (line != "#") {
            line = scanner.nextLine();
            out.write(line);
            out.flush();
        }
        if (line == "#") {
            outputStream.close();
        }

    }
}
