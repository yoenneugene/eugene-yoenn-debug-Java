package com.hemebiotech.analytics;

/**
 * main class
 */
public class Main {
    /**
     * Fonction qui execute le programme dans l'ordre
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
        WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile();
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(readSymptomDataFromFile, writeSymptomDataToFile);
        writeSymptomDataToFile.writeSymptoms(analyticsCounter.sortSymptoms(analyticsCounter.countSymtoms()));

    }
}