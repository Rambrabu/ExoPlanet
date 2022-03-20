package com.planet.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.planet.exceptions.ExoPlanetExceptions;
import com.planet.model.ExoPlanet;
import com.planet.utility.ExoPlanetHTTPClient;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

import java.util.*;
import java.net.URISyntaxException;

public class ExoPlanetService {

    public static final String exoPlanetURI = "https://gist.githubusercontent.com/joelbirchler/66cf8045fcbb6515557347c05d789b4a/raw/9a196385b44d4288431eef74896c0512bad3defe/exoplanets";

    public List<ExoPlanet> getExpoPlanets() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        ExoPlanetHTTPClient exoPlanetHTTPClient = new ExoPlanetHTTPClient();
        String exoPlanetJson = exoPlanetHTTPClient.getRequest(exoPlanetURI);

        ObjectMapper objectMapper = new ObjectMapper();

        List<ExoPlanet> exoPlanets = objectMapper.readValue(exoPlanetJson, new TypeReference<List<ExoPlanet>>(){});

        if(exoPlanets == null || (exoPlanets!=null && exoPlanets.isEmpty())){
            throw new ExoPlanetExceptions("No data Found");
        }
        return exoPlanets;
    }

    public void calculateAndFileWriter() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        List<ExoPlanet> exoPlanets = getExpoPlanets();

        ExoPlanetAggregator exoPlanetAggregator = new ExoPlanetAggregator();

        long orphanPlanetsCount = exoPlanetAggregator.getOrphanPlanetsCount(exoPlanets);
        System.out.println("#1 "+orphanPlanetsCount);

        Optional<String> hottestStarOptional = exoPlanetAggregator.getHottestStar(exoPlanets);
        String hottestStar = hottestStarOptional.isPresent()?hottestStarOptional.get():"";
        System.out.println("#2 "+hottestStar);

        Map<Integer, Map<String, Long>> timelineOfPlanets = exoPlanetAggregator.getTimelineOfPlanets(exoPlanets);
        System.out.println("#3 "+timelineOfPlanets);

        BigDecimal sumOfAllPlanetsTemp = exoPlanetAggregator.getSumOfAllPlanetsTemp(exoPlanets);
        System.out.println("#4 "+sumOfAllPlanetsTemp);

        Map<String, Object> result =  new LinkedHashMap<>();

        result.put("#1", orphanPlanetsCount);
        result.put("#2", hottestStar);
        result.put("#3", timelineOfPlanets);
        result.put("#4", sumOfAllPlanetsTemp);

        Path filePath = Paths.get("src/test/resources/", "output", "output.txt");
        Files.writeString(filePath, result.toString(), StandardOpenOption.APPEND);

    }

}
