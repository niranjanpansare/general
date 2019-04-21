package com.niranjan.parsing.chainofresponsibility;

public class XMLParser extends Parser{

	 
	
	@Override
	public void parse(String filename){
		if(canHandleFile(filename, ".xml")){
			System.out.println("Parsing XML File"+filename);
		}else {
			super.parse(filename);
		}
	}
}
