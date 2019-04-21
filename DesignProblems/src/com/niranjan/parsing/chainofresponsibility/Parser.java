package com.niranjan.parsing.chainofresponsibility;

public class Parser {

	private Parser successor;
	
	public void parse(String filename) {
		if (getSuccessor() != null) {
			getSuccessor().parse(filename);
		} else {
			System.out.println("Unable to find parser for this file " + filename);
		}
	}

	protected boolean canHandleFile(String filename, String format) {
		return filename.endsWith(format);
	}

	public Parser getSuccessor() {
		return successor;
	}

	public void setSuccessor(Parser successor) {
		this.successor = successor;
	}

}
