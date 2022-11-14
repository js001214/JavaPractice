package Practice1114.ex04;		//chapter04.ex06 Ex01

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// 스캐너로 인풋 받은 값을 선택시 해당 내용을 이중 for문을 사용해서 출력하세요.
		// 4. 프로그램 종료시까지 무한 루프를 작동 시키세요.
		// 1 ~ 4 번 외의 내용을 선택시 "잘못된 입력 입니다. 1~4 까지만 넣어주세요.
		
		
		
		
		int select;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("===================================");
			System.out.println("1.구구단출력 | 2. 19단출력 | 3.19단중 7배수단만 출력 | 4. 프로그램 종료");
			System.out.println("===================================");
			System.out.println("위 번호를 선택하세요 >>>");
			
			select = sc.nextInt();
			
			if (select == 1)
			{
				for (int i = 1; i < 10; i++ )
				{
					System.out.println(i + " 단 입니다. ");
					for (int j = 1; j < 10; j++)
					{
						System.out.println(i+" * "+ j + " = " + i*j);
					}
				}
				
			}
			else if (select == 2)
			{
				for (int i = 1; i < 20; i++ )
				{
					System.out.println(i + " 단 입니다. ");
					for (int j = 1; j < 20; j++)
					{
						System.out.println(i+" * "+ j + " = " + i*j);
					}
				}
			}
			else if (select == 3)
			{
				
				for (int i = 1; i < 20; i++ )
				{
					if (i%7==0) 
					{
						System.out.println(i + " 단 입니다. ");
						for (int j = 1; j < 20; j++)
						{
							System.out.println(i+" * "+ j + " = " + i*j);
						}
					}
				}
			}
			else if (select == 4)
			{
				break;
			}
			
			
			
			
		}while(true);
		

	}

}
