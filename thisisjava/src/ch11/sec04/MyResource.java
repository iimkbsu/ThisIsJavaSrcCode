/*
 
 리소스 자동 닫기 (AutoCloseable 인터페이스를 implements 한 리소스 자동닫기)
 
 
 리소스: 데이터를 제공하는 객체, 사용한 후 닫아줘야 다른 곳에서 리소스 사용 가능
 (open close로 열고 닫음, 예외발생 시 예외처리로 finally에서 안전하게 닫아줘야 함)
 
 
 
 예.
 파일 읽고 닫기
 
 FileInputStream fis = null;
 
 try{
 	fis = new FileInputStream("file.txt"); //파일 열기
 	....
 }catch(IOException e){
 	....
 }finally{
 	fis.colse(); //파일 닫기
 }
 
 ----------------------------------------------
 파일 읽고 닫기 개선 
 (try with resources 방법을 통해 finally 없이 예외 시 닫을 수 있음)
 (단, 리소스가 AutoCloseable 인터페이스를 implements 하고 있어야 함)
 
 
 public class FileInputStream implements AutoCloseable{
 	....
 	@Override
 	public void close() throws Exception{
 	....
 	}
 }
 
 
 
 try(FileInputStream fis1 = new FileInputStream("file.txt");
 	 FileInputStream fis2 = new FileInputStream("file2.txt")
 	 ){
 	....
 }catch(IOException e){
 	....
 }
 
 ------------------------------------------------
 아래처럼 사용해도 됨
 
 FileInputStream fis1 = new FileInputStream("file.txt");
 FileInputStream fis2 = new FileInputStream("file2.txt");
 
 try(fis1; fis2){
 ....
 }
 

 */

package ch11.sec04;

public class MyResource implements AutoCloseable {
	
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "abc";
	}
	
	
	@Override
	public void close() throws Exception{
		System.out.println("[MyResource(" + name + ") 닫기]");
	}

}








