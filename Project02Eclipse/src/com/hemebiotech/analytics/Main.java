package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * main class
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
        WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile();
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(readSymptomDataFromFile, writeSymptomDataToFile);
        List<String> symptoms = analyticsCounter.getSymptoms();
        Map<String, Integer> counted = analyticsCounter.countSymtoms(symptoms);
        Map<String, Integer> sorted = analyticsCounter.sortSymptoms(counted);
        analyticsCounter.writeSymptoms(sorted);
    }
}