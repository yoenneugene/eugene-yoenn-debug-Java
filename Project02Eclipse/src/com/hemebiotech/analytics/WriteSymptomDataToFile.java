package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteSymptomDataToFile extends ReadSymptomDataFromFile implements ISymptomWriter {
    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public WriteSymptomDataToFile(String filepath) {
        super(filepath);
    }

    public WriteSymptomDataToFile() {

    }
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(symptoms);



        return sorted;
    }

    public Map<String, Integer> mapsymptoms()
    {
        String symptoms;
        int count = 0;
        Map<String, Integer> mapbysymptoms = new HashMap<>();

        //do things to get the Map built
         for (String result : GetSymptoms()) {
             String line = result ;
             count = Collections.frequency(GetSymptoms(),line);

            mapbysymptoms.put(result,count);
            System.out.println(result);
        }
        //or something similar
        return mapbysymptoms;
    }
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


            try {
                for (Map.Entry<String, Integer> entry : sortSymptoms(mapsymptoms()).entrySet())
                    writer.write(entry.getKey()+entry.getValue()+"\n");

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }




        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
