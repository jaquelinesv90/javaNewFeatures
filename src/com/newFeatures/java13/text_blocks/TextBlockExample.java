package com.newFeatures.java13.text_blocks;

public class TextBlockExample {
	
	public static void main(String[] args) {
		
		String JSON_STRING
			=	"{\r\n}"+"\"name\":\"Text\",\r\n"+"\"website\":\"https://www.%s.com/\"\r\n"+"}";
		
		
		// JAVA 13
		String TEXT_BLOCK_JSON = """
			{
				"name" : "Text",
				"website":"https://www.%s.com/" 
			}	
			""";
	}

}
