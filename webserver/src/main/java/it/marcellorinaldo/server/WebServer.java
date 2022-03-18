package it.marcellorinaldo.server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import it.marcellorinaldo.server.handlers.RootHandler;

public class WebServer {

    private static String PATH_ROOT = "/";
    //private static String PATH_HEADER = "/echoHeader";
    //private static String PATH_GET = "/echoGet";
    //private static String PATH_POST = "/echoPost";
    
    private int port;

    public WebServer(int port) {
        this.port = port;
    }

    public void start() {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext(PATH_ROOT, new RootHandler());
            //server.createContext(PATH_HEADER, null);
            //server.createContext(PATH_GET, null);
            //server.createContext(PATH_POST, null);
            server.start();
        } catch (IOException ioe) {
            System.out.println("Error executing webserver.");
            ioe.printStackTrace();
        }
    }
}
