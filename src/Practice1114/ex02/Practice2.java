package Practice1114.ex02;		//chapter04.ex04 While_Statement, chapter04.ex05 Ex01 내용

public class Practice2 {

	public static void main(String[] args) {
		//2. for 문을 while 문으로 변환
		
		
		System.out.println("\n=========for문으로 출력============");
		for (int a=0; a<10; a++) 
		{
		System.out.print(a + " ");
		
		}
		
		System.out.println("\n=========while문으로 변환해서 출력============");
		
		int a=0;		//초기값
		while (a<10)		//조건
		{
			System.out.print(a+"\t");
			a++;			//증감식
		}
		
		
		
				
				
		
		

	}


}