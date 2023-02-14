package ch05.sec06;

public class ArrayCreateByNewExample {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		double[] arr2 = new double[3];
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		arr2[0] = 1.0;
		arr2[1] = 2.0;
		
		for(int i=0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int j=0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
	}

}
