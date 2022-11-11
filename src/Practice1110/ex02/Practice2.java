package Practice1110.ex02;

import java.util.Scanner;											//<20221110 혼자 하기 성공>

public class Practice2 {

	public static void main(String[] args) {
		// 정수 2개를 Scanner로 Input 받고 두 값이 같으면 true를 다르면 false 출력
		// 이름 2개를 Scanner로 Input 받고 두 값이 true를 다르면 false 출력
		// 등가연산자 사용. 
		// 기본자료형 : ==

		
		int a; //정수2개 선언
		int b;
		
		String Name1;  //이름2개 선언
		String Name2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개를 a 와 b에 차례대로 넣으세요.");
		a = sc.nextInt();		//정수를 넣을 때는 next뒤에 Int를 붙여서 nextInt()를 해야돼!!
		b = sc.nextInt();		
		
		System.out.println( a == b );	// 정수의 값이 같으면 True가 나오고 아니라면 False가 나와!
		
		
		System.out.println("Name1,2에 이름을 넣으세요");
		Name1 = sc.next();				//문자열에는 nextInt()가 아니라 next()만 하면 돼~
		Name2 = sc.next();
		
		System.out.println(Name1.equals(Name2));  //이름의 값이 같으면 True가 나오고 아니라면 False가 나와!
		
		
	}

}
