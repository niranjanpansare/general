package com.niranjan.parsing.stratergy;

public class Stratergy implements Parser {

	@Override
	public void parse(String fileName) {

		if (fileName.endsWith(".xml")) {
			StratergyParser parser = new StratergyParser(new XMLParser());
			parser.executeStrategy(fileName);
		} else if (fileName.endsWith(".json")) {
			StratergyParser parser = new StratergyParser(new JsonParser());
			parser.executeStrategy(fileName);
		} else {
			System.out.println("Not able to pase file " + fileName);
		}

	}

}
