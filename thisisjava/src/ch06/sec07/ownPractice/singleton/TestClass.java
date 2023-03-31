package ch06.sec07.ownPractice.singleton;

public class TestClass {

	public static void main(String[] args) {
		
		CompanyInfo ci1 = CompanyInfo.getInstance();
		
		ci1.setCompanyName("삼성전자");
		ci1.setCompanyAddr("매탄동");
		
		
		String ss = ci1.getCompanyName();
		String sss = ci1.getCompanyAddr();
		
		System.out.println(ss +" " + sss);

	}

}
