package Practice1111.ex01;

import java.util.Scanner;								// <삼향연산자를 이용해서 짝홀 출력>

public class Practice1 {

	public static void main(String[] args) {
		//<문제> 스캐너로 정수 값을 input 받고, input받은 정수값이 홀수이면 "홀수" 라고 출력하고
				//input 받은 값이 짝수이면 "짝수"라고 출력
				//삼항 연산자를 사용해서
		int value1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 짝수 홀수를 나타내세요 ");
		value1 = sc.nextInt();
		
		System.out.println((value1%2==0) ? ("짝수입니다.") : ("홀수입니다"));

	}

}
