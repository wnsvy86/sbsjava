package practice;

import java.util.Scanner;

public class 입출력 {
//	메소드
	public void 이름입력받기() {
        System.out.println("이름을 입력하세요");
        Scanner 스캐너 = new Scanner(System.in);
        String 이름 = 스캐너.next();

// new(지시자) 경우 새로운 인스턴스를 만들겠다 라는 의미

        System.out.println("입력하신이름은 " + 이름 + " 입니다.");
	}
    public void 나이입력받기() {
        System.out.println("나이를 입력하세요");
        Scanner 스캐너 = new Scanner(System.in);
        int 나이 = 스캐너.nextInt();

        System.out.println("입력하신나이는 " + 나이 + " 입니다.");
	}
}
