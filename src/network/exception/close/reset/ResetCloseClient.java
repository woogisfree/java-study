package network.exception.close.reset;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import static util.MyLogger.log;

public class ResetCloseClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        Thread.sleep(1000);

        output.write(1);

        Thread.sleep(1000);

        try {
            int read = input.read();    // java.net.SocketException: Connection reset
            System.out.println("read = " + read);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            output.write(1);    // java.net.SocketException: Broken pipe
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
