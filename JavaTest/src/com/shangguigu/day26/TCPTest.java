package com.shangguigu.day26;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPTest {
    @Test
    public void clientTest() {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress, 8848);
            os = socket.getOutputStream();
            os.write("Hello World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    @Test
    public void serverTest() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8848);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[5];
        int len;
        while ((len = in.read(buffer)) != -1){
            byteArrayOutputStream.write(buffer, 0, len);

        }
        System.out.println(byteArrayOutputStream.toString());


    }
}
