package ch03.sec02;

public class IncreaseDecreaseOperatorExample {
	
	public static void Line() {
		System.out.println("-------------------------");
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("x = " + x);
		x++;
		++x;
		System.out.println("x = " + x);

		Line();
		y--;
		--y;
		System.out.println("y = " + y);
		
		Line();
		z = x++;
		System.out.println("z = " + z); //12
		System.out.println("x = " + x); //13
		
		Line();
		z = ++x;
		System.out.println("z = " + z); //14
		System.out.println("x = " + x); //14
		
		Line();
		z = ++x + y++;
		System.out.println("z = " + z); //15+8 = 23
		System.out.println("x = " + x); //15
		System.out.println("y = " + y); //9
	}

}
