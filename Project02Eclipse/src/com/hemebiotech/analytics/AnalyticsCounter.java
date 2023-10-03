package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *  Analyse la liste de symptoms
 */
public class AnalyticsCounter {
    ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();

    /**
     * constructor
     * @param reader object from class ReadSymtom
     * @param writer object from class Writesymtom
     */
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
        reader = readSymptomDataFromFile;
        WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile();
        writer = writeSymptomDataToFile;

    }

    /**
     *  this method sort a map alphabticly
     * @param symptoms map of symptoms
     * @return
     */
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(symptoms);

        return sorted;
    }

    /**
     * this method is for counting symtoms
     * @return mapbysymmtoms map os symtoms with count
     */
    public Map<String, Integer> countSymtoms() {
        String symptoms;
        int count = 0;
        Map<String, Integer> mapbysymptoms = new HashMap<>();

        //do things to get the Map built
        for (String result : readSymptomDataFromFile.GetSymptoms()) {
            String line = result;
            count = Collections.frequency(readSymptomDataFromFile.GetSymptoms(), line);

            mapbysymptoms.put(result, count);
            System.out.println(result);
        }
        return mapbysymptoms;
    }


}
