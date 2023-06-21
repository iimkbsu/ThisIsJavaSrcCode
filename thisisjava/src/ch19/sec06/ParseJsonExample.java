package ch19.sec06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonExample {

	public static void main(String[] args) {
		
		try {
			
			// 파일로부터 JSON 문자열로 읽기
			Reader reader = new FileReader("C:/ThisIsJavaTemp/member.json", Charset.forName("UTF-8"));
			BufferedReader br = new BufferedReader(reader);
			
			String json = br.readLine();
			br.close();
			
			// JSON 파싱
			JSONObject root = new JSONObject(json);
			
			
			// 속성정보 읽기
			// .getXxx()의 경우 속성/키 값이 null인경우 예외발생 
			// .optXxx()의 경우 속성/키의 값이 없는경우 "" 빈문자열 출력 (예외발생 안 함)
			// .get()으로 퉁치기 가능
			System.out.println("id : " + root.get("id"));
			System.out.println("id : " + root.getString("id"));
			System.out.println("id : " + root.optString("id"));
			System.out.println("name : " + root.getString("name"));
			System.out.println("age : " + root.getInt("age"));
			System.out.println("student : " + root.getBoolean("student"));
			
			
			// 객체의 속성정보 읽기
			JSONObject tel = root.getJSONObject("tel");
			System.out.println("home : " + tel.optString("home"));
			System.out.println("mobile : " + tel.getString("mobile"));
			
			// 배열 속성 정보 읽기
			JSONArray skill = root.getJSONArray("skill");
			
			System.out.print("Skill : ");
			for(int i=0; i<skill.length(); i++) {
				System.out.print(skill.optString(i) + ", ");
			}
			System.out.println();
			
			//향상된 for문 사용
			System.out.print("Skill : ");
			for(Object obj : skill) {
				System.out.print(obj.toString() + ", ");
			}

			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
