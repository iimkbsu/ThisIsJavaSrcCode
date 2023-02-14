  package ch05.sec07;
  
  	public class MultidimenssionalArrayByNewExample {
  		public static void main(String[] args) {
  
  			int[][] mathScores = new int[2][3]; 
  			//mathScores.length = 2
  			//mathScores[0].length = 3
  			//mathScores[1].length = 3
  
  			for(int i = 0; i < mathScores.length; i++) {
  				for(int j = 0; j <mathScores[i].length; j++) { 
  				System.out.println("mathScores["+i +"][" +j+"] : " + mathScores[i][j]);
  				
  				} 	
  			}
  
  			
  
  			mathScores[0][0] = 80;
  			mathScores[0][1] = 83;
 			mathScores[0][2] = 85;
 			mathScores[1][0] = 86;
 			mathScores[1][1] = 90;
 			mathScores[1][2] = 92;
 			
 			int sum1 = 0;
 			int count1 = 0;
 			for(int i = 0; i < mathScores.length; i++) {
 				count1 += mathScores[i].length;
 				
  				for(int j = 0; j <mathScores[i].length; j++) { 
  				sum1 += mathScores[i][j];
  				} 	
  			}
 			double avg1 = (double)sum1 / count1;
 			System.out.println("전체 학생의 수학 평균 : " + avg1);
 			System.out.println();
 			
 			
 			int[][] engScores = new int[2][];
 	  		
 	  		engScores[0] = new int[2];
 	  		engScores[1] = new int[3];
 	  		//engScores.length = 2
 	  		//engScores[0].length = 2
 	  		//engScores[1].length = 3
 	  		
 	  		for(int i=0; i<engScores.length; i++) {
 	  			for(int j = 0; j<engScores[i].length; j++) {
 	  				System.out.println("engScores["+i +"][" +j+"] : " + engScores[i][j]);
 	  			}
 	  		}
 	  		
 	  		engScores[0][0] = 90;
 	  		engScores[0][1] = 91;
 	  		engScores[1][0] = 92; 
 	  		engScores[1][1] = 93; 
 	  		engScores[1][2] = 94;
 	  		
  
 	  		int numEng = 0;
 	  		int sumEng = 0;
 	  		double avgEng = 0;
 	  		
 	  		for(int i =0; i < engScores.length; i++) {
 	  			numEng += engScores[i].length;
 	  			for(int j = 0; j< engScores[i].length; j++) {
 	  				sumEng += engScores[i][j];
 	  			}
 	  		}
 	  		
 	  		
 	  		avgEng = (double)sumEng/numEng;
 	  		System.out.println("전체 학생의 영어 평균 : " + avgEng);
 	  		System.out.println();
  		}
  	}
 