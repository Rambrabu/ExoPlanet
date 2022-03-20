package com.planet.service;

import com.planet.model.ExoPlanet;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExoPlanetAggregator {

    public long getOrphanPlanetsCount(List<ExoPlanet> exoPlanets){
        return exoPlanets.stream()
                .filter(t->t.getTypeFlag() == 3)
                .count();
    }

    public Optional<String> getHottestStar (List<ExoPlanet> exoPlanets){
        return exoPlanets.stream()
                .filter(t->t.getHostStarTempK()!=null)
                .collect(Collectors.maxBy(Comparator.comparing(ExoPlanet::getHostStarTempK)))
                .map(ExoPlanet::getPlanetIdentifier);
    }

    public BigDecimal getSumOfAllPlanetsTemp (List<ExoPlanet> exoPlanets){
         Double sumOfALLPlanesTemp = exoPlanets.stream()
                .filter(t->t.getHostStarTempK()!=null)
                .collect(Collectors.summingDouble(ExoPlanet::getHostStarTempK));
        return BigDecimal.valueOf(sumOfALLPlanesTemp);
    }


    public Map<Integer, Map<String, Long>> getTimelineOfPlanets (List<ExoPlanet> exoPlanets){

        return exoPlanets.stream()
                .filter(t->t.getDiscoveryYear()!=null && t.getRadiusJpt()!=null )
                .collect(Collectors.groupingBy(ExoPlanet::getDiscoveryYear, Collectors.mapping(
                                    ExoPlanet::getRadiusJpt, Collectors.groupingBy(t->{
                                        if(t<1){
                                            return "Small";
                                        }else if(t<2){
                                            return "Medium";
                                        }else{
                                            return "large";
                                        }
                                    }, Collectors.counting()
                                )
                        )

                ));
    }

}
