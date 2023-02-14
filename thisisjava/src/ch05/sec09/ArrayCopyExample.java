package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		
		
		int[] IntArray1 = {1, 2, 3, 4};
		int[] IntArray2 = new int[4];
		
		
		//System.arraycopy(복사할 배열, 복사할 배열 시작인덱스, 붙여넣을 새 배열, 붙여넣을 시작인덱스, 붙여넣을 리터러 수)
		System.arraycopy(IntArray1, 0, IntArray2, 0, IntArray1.length);
		
		System.out.println(Arrays.equals(IntArray1, IntArray2));//true  
		//(배열 값 비교, 문자열은 사용불가)
		
		
		System.out.println(IntArray1.equals(IntArray2));//false 
		//(배열 번지비교, 문자열은 문자열 그대로비교)
		System.out.println();
		
		int[] IntArray3 = new int[4];
		
		//for문으로 배열값 복사
		for(int i=0; i<IntArray1.length; i++) {
			IntArray3[i] = IntArray1[i];
		}
		
		System.out.println(Arrays.equals(IntArray1, IntArray3));//true  
		//(배열 값 비교, 문자열은 사용불가)
		
		
		System.out.println(IntArray1.equals(IntArray3));//false 
		//(배열 번지비교, 문자열은 문자열 그대로비교)
		System.out.println();
		
		
		String[] strArray1 = {"가", "나", "다" };
		String[] strArray2 = new String[3];
		
		System.arraycopy(strArray1, 0, strArray2, 0, strArray1.length);
		
		System.out.println(strArray1 == strArray2);//false (배열의 참조주소비교)
		System.out.println(strArray1[0] == strArray2[0]);//true ("가"의 참조주소비교)
		System.out.println(strArray1.equals(strArray2)); //false
		System.out.println(strArray1[1].equals(strArray2[1]));//true ("가"문자열비교)
		System.out.println();
		
		String[] strArray3 = new String[3];
		for(int j =0; j<strArray1.length; j++) {
			strArray3[j] = strArray1[j];
		}
		System.out.println(strArray1 == strArray3);//false (배열의 참조주소비교)
		System.out.println(strArray1[0] == strArray3[0]);//true ("가"의 참조주소비교)
		System.out.println(strArray1.equals(strArray3)); //false
		System.out.println(strArray1[1].equals(strArray3[1]));//true ("가"문자열비교)
		System.out.println();
		
		String[] strArray4 = new String[4];
		strArray4 = strArray1;
		
		System.out.println(strArray1 == strArray4);//true (배열의 참조주소비교)
		System.out.println(strArray1[0] == strArray4[0]);//true ("가"의 참조주소비교)
		System.out.println(strArray1.equals(strArray4)); //true
		System.out.println(strArray1[1].equals(strArray4[1]));//true ("가"문자열비교)
		System.out.println();
		
		
		
		
		
		
	}

}
