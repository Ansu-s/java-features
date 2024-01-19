package org.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPAPIclient {
    public static void main(String[] args) throws IOException, InterruptedException {
        String uri = "https://postman-echo/com/get?uname=java&pwd=world";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).GET().copy().build();

        HttpClient client = HttpClient.newBuilder().build();

       HttpResponse<String> data = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(data.body());

    }
}
