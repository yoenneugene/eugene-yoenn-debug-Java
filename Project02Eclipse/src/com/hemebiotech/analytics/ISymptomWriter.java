package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * write the name and nomber of time something appear in the list
 */
public interface ISymptomWriter {
    /**
     * Write symptoms and count
     * @param symptoms Map of symptoms
     * @throws IOException
     */
    public void writeSymptoms(Map<String, Integer> symptoms) throws IOException;
}
