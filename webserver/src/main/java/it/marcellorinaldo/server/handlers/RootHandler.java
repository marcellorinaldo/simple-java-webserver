package it.marcellorinaldo.server.handlers;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.FileUtils;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class RootHandler implements HttpHandler {

    private static final String INDEX_FILE_PATH = "www/index.html";
    private static final int CODE_RESPONSE_OK = 200;

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "<!doctype html><html><head><h1>Welcome!</h1></head></html>";

        File htmlFile = new File(INDEX_FILE_PATH);
        if (htmlFile.exists()) {
            response = FileUtils.readFileToString(htmlFile);
            System.out.println("Loading '" + htmlFile.getPath() + "'.");
        }
        
        exchange.sendResponseHeaders(CODE_RESPONSE_OK, response.length());
        OutputStream output = exchange.getResponseBody();
        output.write(response.getBytes());
        output.close();
    }
    
}
