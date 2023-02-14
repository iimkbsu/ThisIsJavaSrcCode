package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		
		int[][] scores = {
						{80,90,96},
						{76,88}
						};
			
		System.out.println("number of class : " + scores.length);
		System.out.println("number of students from class 1 : " + scores[0].length);
		System.out.println("number of students from class 2 : " + scores[1].length);
		System.out.println();
		System.out.println("scores[0][2] : " + scores[0][2]); //90
		System.out.println("scores[1][1] : " + scores[1][1]); //88
		System.out.println();
		
		int sum1 = 0;
		for(int i=0; i <scores[0].length; i++) {
			sum1 += scores[0][i];
		}
		double avg1 = (double)sum1 / scores[0].length;
		
		System.out.println("avg scores of class 1 : " + avg1);
		
	
		int sum2 = 0;
		for(int i=0; i <scores[1].length; i++) {
			sum2 += scores[1][i];
		}
		double avg2 = (double)sum2 / scores[1].length;
		
		System.out.println("avg scores of class 2 : " + avg2);
		
		
		int NumStudent = 0;
		int sum3 = 0;
		double avg3 = 0;
		for(int i = 0; i<scores.length; i++) {
			NumStudent += scores[i].length;
			for(int j = 0; j<scores[i].length; j++) {
				sum3 += scores[i][j];
			}
		}
		avg3 = (double)sum3 / NumStudent;
		
		System.out.println("avg scores of all students : " + avg3);
	}
}
