package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client extends Thread {
    @Override
    public void run() {
        try (Socket socket = new Socket("127.0.0.1",8085 )) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("test");
        } catch (IOException e) {

        }
    }
    public static void main(String[] args) {
        Thread t = new Client();
        t.start();
    }
}
