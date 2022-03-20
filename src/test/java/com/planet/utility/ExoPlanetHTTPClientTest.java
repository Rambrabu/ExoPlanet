package com.planet.utility;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.*;

class ExoPlanetHTTPClientTest {

    public static final String EXO_PLANET_URI = "https://gist.githubusercontent.com/joelbirchler/66cf8045fcbb6515557347c05d789b4a/raw/9a196385b44d4288431eef74896c0512bad3defe/exoplanets";

    public static final String INVALID_URI = "https://testurlforfailure/";


    @Test
    public void shouldGetStatusCodeAs200WhileHittingAPI() throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(EXO_PLANET_URI))
                .version(HttpClient.Version.HTTP_2)
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        assertEquals(response.statusCode(), HttpURLConnection.HTTP_OK);
    }

    @Test
    public void shouldGetStatusAs200() throws IOException, InterruptedException, URISyntaxException {
        ExoPlanetHTTPClient exoPlanetHTTPClient = new ExoPlanetHTTPClient();
        String response = exoPlanetHTTPClient.getRequest(EXO_PLANET_URI);
        assertNotNull(response);
    }

  /*  @Test(expected = ConnectException.class)
    public void shouldFailForInvalidURI() throws IOException, InterruptedException, URISyntaxException {
        ExoPlanetHTTPClient exoPlanetHTTPClient = new ExoPlanetHTTPClient();
        String response = exoPlanetHTTPClient.getRequest(INVALID_URI);
        assertThrows(ConnectException.class, () -> response.toString() );
    }*/
}