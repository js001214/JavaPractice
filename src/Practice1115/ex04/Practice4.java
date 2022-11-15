package Practice1115.ex04;				//chapter05.ex02; Ex03 복습

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방번호를 인풋 받습니다.
				// 배열 변수 : arr1, 2의 배수를 저장후 출력, enhanced for문을 사용해서 출력
				// 배열 변수 : arr2, 3의 배수를 인풋 받아서 출력, for문을 사용해서 출력
				// arr1.length
		Scanner sc = new Scanner(System.in);
		int n; //방의 개수
		int i;
		
		
		System.out.println("방의 개수를 입력하세요");
		
		n = sc.nextInt();
		int[] arr1= new int[n];
		int[] arr2= new int[n];
		
		for(i = 0 ; i < arr1.length ; i++)
		{
			arr1[i]=(i+1)*2;
		}
		for(int k : arr1)
		{
			System.out.println(k);
		}
		
		System.out.println();
		for(i = 0 ; i < arr2.length ; i++)
		{
			arr2[i]=(i+1)*3;
			System.out.print(arr2[i]+ " " );
		}
		
	}

}
