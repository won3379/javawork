package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
	/*	//매개변수가 있는 생성자로 user1 인스턴스 생성
		User user1 = new User("sky789", "12345", "서정원");
		
		System.out.println("아이디:"+user1.getId());
		System.out.println("비밀번호:"+user1.getPwd());
		System.out.println("이름:"+user1.getName());
		*/
		//크기가 3인 배열 생성// 인덱스는 위치한 자리 
			User[] users =new User[3];

		//user 3명객체(인스턴스)생성
		User user1 = new User("sky789", "12345", "서정원");
		User user2 = new User("sky567", "23456", "우영우");
		User user3 = new User("sky123", "234567", "장그래");

		
		//배열에 객체를 저장(입력)
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		//users[0] 1개출력
		System.out.println(users[0].getId()+", "+
				users[0].getPwd() +", "+ users[0].getName());
		System.out.println("======================================");
		//전체 출력
		for(int i =0; i<users.length; i++) {
			System.out.println(users[i].getId()+", "+
					users[i].getPwd() +", "+ users[i].getName());
			
		}

	}

}
