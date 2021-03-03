package cobble.dgnscrts.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import cobble.dgnscrts.simplejson.JSONObject;
import cobble.dgnscrts.simplejson.parser.JSONParser;

public class DataGetter
{			
	public static Object find(String objectName) throws Exception  {
		JSONParser parser = new JSONParser();
		Object dataOutput = null;
		try {
			Object obj = parser.parse(new FileReader("config/sbp/main.cfg"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject data = (JSONObject) obj;
			
			dataOutput = data.get(objectName);
			

		} catch (Exception e) {
			throw new Exception("Download SkyblockPersonalized as well!");
		}
		return dataOutput;
	}
	
	public static Object findSpecific(String fileName, String objectName) {
		JSONParser parser = new JSONParser();
		Object dataOutput = null;
		try {
			Object obj = parser.parse(new FileReader(fileName));
 
			// A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject data = (JSONObject) obj;
			
			dataOutput = data.get(objectName);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataOutput;
	}
}
