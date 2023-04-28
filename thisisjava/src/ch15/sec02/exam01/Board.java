package ch15.sec02.exam01;

public class Board {
	
	///
	private String subj;
	private String cont;
	private String writer;
	
	
	///
	public Board(String subj, String cont, String writer) {
		this.subj = subj;
		this.cont = cont;
		this.writer = writer;
	}
	
	///
	public void setSub(String subj) {
		this.subj = subj;
	}
	
	public String getSub() {
		return subj;
	}

	
	///
	public void setCont(String cont) {
		this.cont = cont;
	}
	
	public String getCont() {
		return cont;
	}
	
	///
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	
}







