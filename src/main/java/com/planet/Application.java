package com.planet;

import com.planet.exceptions.ExoPlanetExceptions;
import com.planet.service.ExoPlanetService;

import java.io.IOException;
import java.net.URISyntaxException;

public class Application {

    public static void main(String[] args) {
        ExoPlanetService exoPlanet = new ExoPlanetService();
        try {
            exoPlanet.calculateAndFileWriter();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExoPlanetExceptions e) {
            e.printStackTrace();
        }
    }

}
