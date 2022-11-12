package Practice1111.ex03;

import java.util.Scanner;
										//<<scanner를 이용해서 if문 만들기>>
public class Practice3 {

	public static void main(String[] args) {
		//// IF문을 사용해서	, if .. else if ... else if ...else
		// 스캐너를 사용해서 가지고 있는 돈을 입금 받습니다.
		// 변수의 값이 0 ~ 3000 : 걸어서 다닙니다.
		// 3000 ~ 30000 : 지하철을 타고 다닙니다.
		// 30000 ~ 100000 : 택시를 타고 다닙니다.
		// 100000 ~ : 비행기를 타고 다닙니다.
		
		int money;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("가지고 있는 돈을 입력하시면 적절한 이동수단을 추천해드립니다.");
		
		money = sc.nextInt();
		if (money >=100000 )
		{
			System.out.println("비행기를 추천합니다.");
		}
		else if (money >= 30000 && money < 100000 )
		{
			System.out.println("택시를 타고 다닙니다.");
		}
		else if (money >= 3000 && money < 30000)
		{
			System.out.println("지하철을 추천 드립니다.");
	    }
		else if (money >= 0 && money < 3000)
		{
			System.out.println("걸어다니세요");
		}
		else 
		{
			System.out.println("다시 입금하세요");
		}
	}
}
