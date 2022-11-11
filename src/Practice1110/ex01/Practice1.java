package Practice1110.ex01;           //     <<SCANNER>>      
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록하고 import해주고                                   <20221110 혼자 하기 성공>     
		// 이름, 어머니 이름, 아버지 이름, 형제 이름, 자신 이름			sc.next();
		// 어머니 나이, 아버지 나이, 형제 나이 ,자신 나이				sc.nextInt();
		
		// 콘솔에서 인풋 받은 이름은 모두 출력
		// 나이의 합계와 평균을 출력

		String Name1;
		String Name2;
		String Name3;
		String Name4;
		
		int motherage;
		int fatherage;
		int brotherage;
		int myage;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어머니 아버지 형 자신의 이름을 차례대로 입력해주세요.");
		Name1 = sc.next();
		Name2 = sc.next();
		Name3 = sc.next();
		Name4 = sc.next();
		
		System.out.println("어머니 아버지 형 자신의 나이를 차례대로 입력해주세요.");
		motherage = sc.nextInt();
		fatherage = sc.nextInt();
		brotherage = sc.nextInt();
		myage = sc.nextInt();
		
		
		System.out.println(" 어머니의 이름과 나이는 " + Name1 + motherage + " 아버지의 이름과 나이는 " + Name2 + fatherage);
		System.out.println(" 형의 이름과 나이는 " + Name3 + brotherage + " 나의 이름과 나이는 " + Name4 + fatherage);
		
		
		
		
		
		
	}

}
