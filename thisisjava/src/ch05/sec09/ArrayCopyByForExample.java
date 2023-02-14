package ch05.sec09;


public class ArrayCopyByForExample {

	public static void main(String[] args) {
		
		//for문을 사용하여 배열 복사
		
		int[] oldIntArray = new int[3];
		oldIntArray = new int[] {1, 2, 3};
		
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int j = 0; j < newIntArray.length; j++) {
			System.out.print(newIntArray[j] + " ");
		}

	}

}
