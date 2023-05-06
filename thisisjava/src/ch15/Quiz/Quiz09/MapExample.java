package ch15.Quiz.Quiz09;

import java.util.Map;
import java.util.HashMap;

import java.util.Set;


public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> stdScoresMap = new HashMap<>();
		
		stdScoresMap.put("blue", 96);
		stdScoresMap.put("hong", 86);
		stdScoresMap.put("white", 92);

		
		
		String highScoreStd = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		//여기에 작성하세요
		Set<String> stdName = stdScoresMap.keySet();
		
		
		for(String tmpName : stdName) {
			Integer score = stdScoresMap.get(tmpName);
			totalScore += score;
			if(score >= maxScore) {
				maxScore = score;
				highScoreStd = tmpName;
			}
		}
		double avg = totalScore/stdName.size();
		
		System.out.println("최고점수 : " + maxScore + "\n최고점수 학생 : " + highScoreStd + "\n평균 점수 : " + avg);
		
		

	}

}
