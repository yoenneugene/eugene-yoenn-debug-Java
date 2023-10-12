package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.*;

/**
 *  Analyse la list de symptoms
 */
public class AnalyticsCounter {
    ISymptomReader symptomReader;
    ISymptomWriter symptomWriter ;

    /**
     * constructor
     * @param reader object from class ReadSymtom
     * @param writer object from class Writesymtom
     */
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
      symptomReader = reader ;
      symptomWriter = writer;


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
    public Map<String, Integer> countSymtoms(List<String>symptoms) {

        int count = 0;
        Map<String, Integer> mapbysymptoms = new HashMap<>();

        //do things to get the Map built
        for (String symptom : symptoms) {

            mapbysymptoms.putIfAbsent(symptom,1);
            int n = mapbysymptoms.get(symptom);
            mapbysymptoms.put(symptom,n+1);

        }
        return mapbysymptoms;
    }

    /**
     *
     * @return
     */
    public List<String> getSymptoms() {
        return symptomReader.GetSymptoms();
    }

    /**
     *
     * @param symptoms
     * @throws IOException
     */
    public void writeSymptoms(Map<String, Integer> symptoms) throws IOException {
        symptomWriter.writeSymptoms(symptoms);
    }
}
