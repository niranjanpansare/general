 
# Problem Statement
Create a design  such that depending on the format of the file(Json and XML) being passed to the parser,
the parser has to decide how to parse the file

# Details   

The parser would be JSON file parser and XML file parser.
The parsing logic in each of these parser doesn’t parse any file,
instead it just prints out a message stating who is handing the request for which file.

 We then populate file names of different formats
 into a list and then iterate through them passing the file name to the first parser in the list.
 
# Pattens Used 
  1.Chain of Responsibility <br /> 
  2. Stratergy 
 
 # Sample Output
 Not able to pase file nir.txt <br />
Parsing JsonFile <br />
testJson.json <br />
XML Parsing  for filetestXml.xml <br />
Not able to pase file testCsvFile.csv <br />
Not able to pase file testDocFile.doc <br />
