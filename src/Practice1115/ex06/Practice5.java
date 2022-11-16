package Practice1115.ex06;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		int select;
		int idx;
		
		
		Scanner sc = new Scanner(System.in);
		
		do {	
		System.out.println("========================================================");
		System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고. 7의 배수와 8의 배수 저장후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도로고 값을 넣는데 4배수만 빼고 저장후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3씩 증가하도록 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼기");
		System.out.println("4.프로그램 종료");
		
		System.out.println("1번에서 4번까지 번호를 선택하세요>>>");
		
		select=sc.nextInt();
		if (select == 1)
		{
			int i = 0;
			idx=sc.nextInt();
			int [] arr1 = new int[idx];
			
			for ( int a = 1 ; a < 5000; a++) 
			{
				if (a%7==0 || a%8==0)
				{
					arr1[i]=a;
					i++;
				}
				if ( i == idx)
				{
					break;
				}
			}
			for (i = 0 ; i < idx ; i++)
			{
				System.out.print(arr1[i]+ " ");
			}
			
			
		}
		if (select == 2)
		{
			
		}
		if (select == 3)
		{
			
		}
		if (select == 4)
		{
			break;
		}
	
		
		}while(true);
	}

}
