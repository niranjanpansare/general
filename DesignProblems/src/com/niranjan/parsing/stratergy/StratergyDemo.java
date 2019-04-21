package com.niranjan.parsing.stratergy;

import java.util.ArrayList;
import java.util.List;

public class StratergyDemo {

	public static void main(String[] args) {

		List<String> fileList = populateFiles();
		Parser parser = new Stratergy();
		for (String fileName : fileList) {
			parser.parse(fileName);
		}
	}

	private static List<String> populateFiles() {
		List<String> fileList = new ArrayList<>();
		fileList.add("nir.txt");
		fileList.add("testJson.json");
		fileList.add("testXml.xml");
		fileList.add("testCsvFile.csv");
		fileList.add("testDocFile.doc");
		return fileList;
	}
}
