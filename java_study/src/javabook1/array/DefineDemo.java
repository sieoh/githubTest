package javabook1.array;

public class DefineDemo {

	public static void main(String[] args) {
		// 문제 1: 프로젝트 팀원의 이름을 저장하는 배열을 생성하시오
		String[] name = {"이시연","권정섭"};
		
		// 문제 2: 프로젝트 팀원의 이름을 저장한 배열을 출력하시오(for 문 사용)
//		System.out.println("프로젝트 팀원의 이름은 다음과 같다");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("=============================");
		// 문제 3: 프로젝트 팀원의 이름과 성별을 저장하는 배열을 생성하시오.
		String[][] Project = {
				{"이시연","여자"},
				{"권정섭","남자"}
		};
//		System.out.println("프로젝트 팀원의 이름과 성별을 다음과 같다");
		for(int j=0;j<Project.length;j++) {
			for(int i=0;i<Project[j].length;i++) {
				System.out.println(Project[j][i]);
			}
		}
		System.out.println("=============================");
		// 문제 4: 프로젝트 팀원을 저장한 배열에서 자신의 이름만 출려하시오
		
		System.out.println(Project[0][0]);
		
		
	}

}
