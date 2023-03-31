package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		
		try(MyResource res = new MyResource("res")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e){
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		//////////////////////////////////////////////
		
		try(MyResource res = new MyResource("res")){
			String data = res.read2();
			int value = Integer.parseInt(data);
		}catch(Exception e){
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		////////////////////////////////////////
		
		MyResource res1 = new MyResource("res1");
		MyResource res2 = new MyResource("res2");
		
		try(res1; res2){
			String data = res1.read1();
			String data2 = res2.read2();
			int value = Integer.parseInt(data);
			int value2 = Integer.parseInt(data2);
		}catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println();

	}

}
