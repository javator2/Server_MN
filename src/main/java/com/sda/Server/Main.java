package com.sda.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        int portNumber = 5555;
        System.out.println("Słucham na porcie: "+portNumber);
        ServerSocket serverSocket = new ServerSocket(portNumber);
        while (true){
            Socket clientSocket = serverSocket.accept();
        }
    }
}
