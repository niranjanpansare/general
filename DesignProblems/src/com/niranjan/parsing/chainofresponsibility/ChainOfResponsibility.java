package com.niranjan.parsing.chainofresponsibility;

public class ChainOfResponsibility extends Parser {

	public void parse(String fileName) {
		Parser xmlParser = new XMLParser();
		Parser jsonParser = new JsonParser(xmlParser);
		jsonParser.parse(fileName);
	}
}
