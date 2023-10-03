package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {



		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
		readSymptomDataFromFile.GetSymptoms();
		WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile();


		writeSymptomDataToFile.writeSymptoms(writeSymptomDataToFile.mapsymptoms());



	}
}
