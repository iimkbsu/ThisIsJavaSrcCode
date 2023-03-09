package ch08.Quiz.Quiz07;

public class MySqlDao implements DataAccessObject {

	String server = "MySql";
	@Override
	public void select() {
		System.out.println(server + " DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println(server + " DB에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println(server + " DB에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(server + " DB에서 삭제");
		
	}


}
