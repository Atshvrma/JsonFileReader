package com.atshvrma.readjson.CheckJson1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException, ParseException
    {
//    		JSONParser parser = new JSONParser();
//    		JSONArray array =  (JSONArray) parser.parse(new FileReader("/users/atishverma/Downloads/test7Labresults.json"));
//    		
//    		for (Object object : array) {
//    			JSONObject person = (JSONObject) object;
//    			
//				String str = (String)person.get("resourceType");
//				System.out.println(str);
//    		}
//    
    		ObjectMapper mapper = new ObjectMapper();
    		InputStream is = App.class.getResourceAsStream("/users/atishverma/Downloads/test7Labresults.json");
    		Object testObj = mapper.readValue(is, App.class);
    		
    		
    
    }
}
