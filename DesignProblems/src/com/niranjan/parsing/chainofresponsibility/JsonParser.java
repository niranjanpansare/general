package com.niranjan.parsing.chainofresponsibility;

public class JsonParser extends Parser{

	public JsonParser(Parser successor){
		this.setSuccessor(successor);
	}
	
	@Override
	public void parse(String filename){
		if(canHandleFile(filename, ".json")){
			System.out.println("Parsing Json File"+filename);
		}else {
			super.parse(filename);
		}
	}
}
