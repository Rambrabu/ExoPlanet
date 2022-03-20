package com.planet.service;

import com.planet.exceptions.ExoPlanetExceptions;
import com.planet.model.ExoPlanet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.util.*;


class ExoPlanetAggregatorTest {
    List<ExoPlanet> exoPlanets ;
    ExoPlanetService exoPlanetService = new ExoPlanetService();
    ExoPlanetAggregator exoPlanetAggregator = new ExoPlanetAggregator();


    @Test
    void getOrphanPlanetsCount() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        exoPlanets = exoPlanetService.getExpoPlanets();
        long orphanPlanetsCount = exoPlanetAggregator.getOrphanPlanetsCount(exoPlanets);
        Assert.assertEquals(orphanPlanetsCount, 2 );
    }

    @Test
    void getOrphanPlanetsCountWhenExoPlanetIsEmpty() {
        long orphanPlanetsCount = exoPlanetAggregator.getOrphanPlanetsCount(new ArrayList<ExoPlanet>());
        Assert.assertEquals(orphanPlanetsCount, 0 );
    }

    @Test
    void getHottestStar() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        exoPlanets = exoPlanetService.getExpoPlanets();
        Optional<String> hottestStarOptional = exoPlanetAggregator.getHottestStar(exoPlanets);
        String hottestStar = hottestStarOptional.isPresent()?hottestStarOptional.get():"";
        Assert.assertEquals(hottestStar, "V391 Peg b" );
    }

    @Test
    void getHottestStarWhenExoPlanetIsEmpty() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        Optional<String> hottestStarOptional = exoPlanetAggregator.getHottestStar(new ArrayList<ExoPlanet>());
        String hottestStar = hottestStarOptional.isPresent()?hottestStarOptional.get():"";
        Assert.assertEquals(hottestStar, "" );
    }

    @Test
    void getSumOfAllPlanetsTemp() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        exoPlanets = exoPlanetService.getExpoPlanets();
        BigDecimal sumOfALLPlanesTemp = exoPlanetAggregator.getSumOfAllPlanetsTemp(exoPlanets);
        Assert.assertEquals(sumOfALLPlanesTemp, BigDecimal.valueOf(18246462.6) );
    }

    @Test
    void getSumOfAllPlanetsTempWhenExoPlanetIsEmpty() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        BigDecimal sumOfALLPlanesTemp = exoPlanetAggregator.getSumOfAllPlanetsTemp(new ArrayList<ExoPlanet>());
        Assert.assertEquals(sumOfALLPlanesTemp, BigDecimal.valueOf(0.0) );
    }

    @Test
    void getTimelineOfPlanets() throws URISyntaxException, IOException, InterruptedException, ExoPlanetExceptions {
        exoPlanets = exoPlanetService.getExpoPlanets();
        Map<Integer, Map<String, Long>> planetsTimeline = exoPlanetAggregator.getTimelineOfPlanets(exoPlanets);
        Assert.assertNotNull(planetsTimeline);
    }
}