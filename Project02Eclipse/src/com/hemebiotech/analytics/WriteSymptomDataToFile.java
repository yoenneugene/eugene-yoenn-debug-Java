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



    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


            try {
                for (Map.Entry<String, Integer> entry : symptoms.entrySet())
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
