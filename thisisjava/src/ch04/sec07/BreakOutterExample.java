package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		//A-a, A-b ... Z-a, Z-b... Z-z 출력하는 문에서 A-g 이후에 종료시키기
		
		
		//라벨(레이블)을 밖 for문에 달아주고 break 라벨을 안쪽에서 사용하면 전체 라벨이 달린 for문 전체 종료
		//라벨(아무이름) : for (조건식) {
		//					for (조건식) {
		//						break 라벨;
		//					}
		//				}
		
		
		char Outter = 'A';
		Label_1 : for(Outter = 'A'; Outter <= 'Z'; Outter++) {
			for(char inner = 'a'; inner <= 'z'; inner++) {
				System.out.println(Outter + "-" + inner);
				if(inner == 'g') {
					break Label_1;
				}
			}
			
		}
		
		
	}

}
