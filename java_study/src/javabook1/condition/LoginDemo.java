package javabook1.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// 로그인 확인 : 아이디 / 비밀번호
		
		String id = "siyeon";
		
//		만약, 아이디가 siyeon 이면 로그인 성공
//		그렇지 않으면 로그인 실패 표시
		
//		System.out.println(id.equals("siyeon"));
		
		if(id.equals("siyeon")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
