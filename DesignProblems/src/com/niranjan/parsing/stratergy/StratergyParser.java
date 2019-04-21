package com.niranjan.parsing.stratergy;

public class StratergyParser {

	private Parser parser;

	public StratergyParser(Parser parser) {
		this.parser = parser;
	}

	public void executeStrategy(String fileName) {
		parser.parse(fileName);
	}
}
