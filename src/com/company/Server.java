package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(8085)) {
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            System.out.println(new String(dataInputStream.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println();
        }
        System.out.println(getName() + ": Skończyłem");
    }
}
