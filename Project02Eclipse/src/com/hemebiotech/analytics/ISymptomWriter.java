package com.hemebiotech.analytics;

import java.io.IOException;

import java.util.Map;

/**
 * write the name and number of time something appear in the list
 */
public interface ISymptomWriter {
    /**
     * Write symptoms and count
     * @param symptoms Map of symptoms
     * @throws IOException
     */
     void writeSymptoms(Map<String, Integer> symptoms) throws IOException;
}
