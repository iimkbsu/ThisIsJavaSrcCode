package ch19.sec06;

import java.io.FileWriter;
import java.io.Writer;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {

	public static void main(String[] args) {
		
		
		JSONObject jo = new JSONObject();
		

		jo.put("name", "한겨울");
		jo.put("student", true);
		jo.put("id", "winter");
		jo.put("age", 25);
		

		
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		
		jo.put("skill", skill);
		
		
		JSONObject tel = new JSONObject();
		tel.put("mobile", "010-1234-1234");
		tel.put("home", "02-123-1234");
		
		jo.put("tel", tel);
		
		String json = jo.toString();
		System.out.println(json);
		
		
		try {
			Writer writer = new FileWriter("C:/ThisIsJavaTemp/member.json");
			writer.write(json);
			writer.flush();
			writer.close();
			
		}catch(Exception e) {
			
		}
		
	}

}
