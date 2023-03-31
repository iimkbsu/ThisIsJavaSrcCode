package ch06.sec07.ownPractice.singleton;

public class CompanyInfo {
	
	//private 접근제한의 static 클래스 타입 변수 설정
	private static CompanyInfo instance;
	
	//필드를 private 접근제한 하여 외부에서 사용하지 못하게 막음
	private String companyName;
	private String companyAddr;
	
	//생성자를 private 접근제한 하여 외부에서 생성하지 못하게 막음
	private CompanyInfo() {
	}
	
	
	
	public static CompanyInfo getInstance() {
		
		//객체 생성
		if(instance == null) {
			
			synchronized(CompanyInfo.class) {
				instance = new CompanyInfo();
			}
		}
		return instance;
	}
	
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	public String getCompanyAddr() {
		return companyAddr;
	}
	
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

}
