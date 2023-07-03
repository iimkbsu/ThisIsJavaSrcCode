package ch20.oracle.sec09.exam01;

import lombok.Data;

@Data //Constructor, Getter, Setter, hashCode(), equals(), toString()
public class User {
	
	private String userId;
	private String userName;
	private String userPw;
	private int userAge;
	private String userEmail;

}
