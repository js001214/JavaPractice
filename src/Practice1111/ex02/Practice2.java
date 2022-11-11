package Practice1111.ex02;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// <<스캐너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성 해주세요.>>
		// IF문을 사용
		int kor;
		int math;
		int music;
		int select; //선택번호
		int number; //2번칸에 쓸 정수
		
		String aName;
		String bName;
		
		System.out.println("==============================================");
		System.out.println("1.학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름식별");
		System.out.println("=============================================="); //if 학점을 선택하면 {} else if 2번이면 {}
		System.out.println("위의 번호를 선택하세요.>>>");
		
		Scanner sc = new Scanner(System.in);
		select =sc.nextInt();
		if (select == 1)
		{
			System.out.println("학점을 국어 수학 음악순으로 입력하세요");
			kor = sc.nextInt();
			math = sc.nextInt();
			music = sc.nextInt();
			
			int sum = kor + math + music;
			double avg = sum/3.0;
			
			System.out.print("학점의 합계는" + sum + "입니다.");
			System.out.print("   학점의 평균은" + avg + "입니다.");
		}
		else if (select == 2)
		{
			System.out.println("정수를 입력하여 홀수인지 짝수인지 구분합니다.");
			number=sc.nextInt();
			System.out.println((number%2==0) ? ("짝수입니다") : ("홀수입니다"));
		}
		else if (select == 3)
		{
			System.out.println("첫번째 이름을 입력하세요");
			aName=sc.next();
			System.out.println("두번째 이름을 입력하세요");
			bName=sc.next();
			if (aName.equals(bName)) {
				System.out.println("서로 같은 이름입니다.");
			}
			else
			{
				System.out.println("서로 다른 이름입니다.");
			}
			
		}
		

	}

}
