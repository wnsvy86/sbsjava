package sbsjava;

import java.util.Arrays;
import java.util.Iterator;

//진입점이  
//실행클래스
//main메소드가 있는게 실행클래스

//단하나의 실행클래스 말고는 
//모두 참조클래스(라이브러리클래스)

public class Main {
//	메인메소스 특별하다	
	public static void main(String[] args) {
//		출력문 출력
//		내 눈으로 봐야 확인 눈으로 직접확인하기
//		디버깅 기본
//		print()
//		줄바꿈을 자동으로 넣어준다 (println)
		System.out.println("안녕 자바공부재밌다"); // 세미콜론
//		직접줄바꿈
		System.out.print("안녕 자바공부재밌다\n"); // 세미콜론
		System.out.print("안녕 자바공부재밌다\n"); // 세미콜론
//		포멧
		System.out.printf("%s 자바 %s 재밌다\n", "안녕", "공부"); // 세미콜론
		System.out.printf("%d 자바 %d 재밌다\n", 1, 4); // 세미콜론
		System.out.printf("%.2f 자바 %d 재밌다\n", 1.34, 4); // 세미콜론
		System.out.printf("%.2f 자바 %d 재밌다\n", 1.34, 4); // 세미콜론
//		
//		s(String) d(Data), f(Float) .2
		
//		문자열화
//		대입연산자
//		타입 (Sting) 변수명 (ex : 이름) = 
//		String 이름 = "홍길동"; //변수
		String[] 이름= {"홍", "길", "동"};
		System.out.println("안녕" + "하세요 " + Arrays.toString(이름)); // 세미콜론
		
//		컨 f11
//		컨 S 저장
//		컨 / 주석
//		컨 알 다운		한줄아래로 복사
//		알 업  혹은 다운	한줄 이동
//		빨리 단축키의 중요성	이클립스를 다룬다 이클립스 단축키

//		컨쉬B 브레이크포인트
//		컨쉬F 포맷팅
//		컨쉬L		단축키
//		컨 D		한줄삭제
//		컨 스페이스	단축키호출
//		F3
	}
}
