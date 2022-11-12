 package Practice1111.ex04;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// <문제> switch문을 사용하여 프로그램 하세요.
				// 스캐너로 정수 1를 인풋 받으면 "금메달입니다" 출력
				// 2를  인풋 받으면 "은메달입니다" 출력
				// 3을 인풋 받으면 "동메달입니다" 출력
				// 그 외 값을 인풋 받으면 " 메달이 없습니다"
		
		int medal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~3숫자를 입력하세요");
		medal =sc.nextInt();
		
		switch (medal) {
		 case 1:	
			 System.out.println("금메달입니다.");
			 break;
		 case 2:
			 System.out.println("은메달입니다.");
			 break;
		 case 3:
			 System.out.println("동메달입니다.");
			 break;
	}

  }
}
