package Practice1114.ex01;		//chapter4 ex.03 Ex02	 내용

public class Practice1 {

	public static void main(String[] args) {
		//<문제> 2중 For문을 사용해서 1단에서 19단까지 출력
		// 3의 배수단과 출력
		
		
		// 1~19단 출력

		for (int i = 0; i < 20; i++)
		{
			System.out.println(i+"단 입니다.");
			for (int j =0; j < 20; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j + "입니다.");
			}
		}
		
		System.out.println();
		System.out.println("=====================================");
		
		// 3의 배수만 출력
		
		for (int i = 1; i < 20; i++)
		{
			if (i%3==0) 
			{
				System.out.println(i + "단 입니다. ");
				for (int j = 1; j < 20; j++)
				{
					System.out.printf("\n%d * %d = %d 입니다.\n", i, j, i*j);
				}
				System.out.println();
			}
			
		}
		
	}

}
