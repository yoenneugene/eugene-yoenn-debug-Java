package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath = "/home/yenx/Documents/eugene-yoenn-debug-Java/Project02Eclipse/symptoms.txt";
	
	/**
	 *  Constructor with parameter string of filepath
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.setFilepath(filepath);
	}

	/**
	 * constructor by default
	 */
	public ReadSymptomDataFromFile() {

	}

	/**
	 * Function who read file and create a list of result
	 * @return
	 */
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (getFilepath() != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(getFilepath()));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
}
