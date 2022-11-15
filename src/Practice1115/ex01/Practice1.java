package Practice1115.ex01;			//chapter05.ex01; Ex01 복습

public class Practice1 {				

	public static void main(String[] args) {
		// <문제>
				// 배열 선언 4가지 방법
				// 1. 배열 변수 이름 : arr1, 정수로 방 3개로 지정, 40, 50 ,60 넣고 출력 <<배열 선언1>>
				// 2. 배열 변수 이름 : arr2, 실수로 방 3개로 지정, 40.0, 50.0, 60.0,70.0 넣고 출력 <<배열 선언2>>
				// 3. 배열 변수 이름 : arr3, 문자열 3개, "오늘", "날씨", "흐림" <<배열 선언3>>
				// 4. 배열 변수 이름 : arr4, 문자 3, 'A', 'B', 'C' <<배열 선언4>>
		//1
		int[] arr1 = new int[3];
		arr1[0] = 40;
		arr1[1] = 50;
		arr1[2] = 60;
		
		for(int i = 0 ; i < 3 ; i ++) 
		{
		System.out.println(arr1[i]);
		}
		//2
		
		double[] arr2 = new double [] {40.0, 50.0, 60.0, 70.0};
		for(int i = 0 ; i < 4 ; i ++)
		{
			System.out.println(arr2[i]);
		}
		
		String arr3[] = new String [3];
		
		arr3[0] = "오늘";
		arr3[1] = "날씨";
		arr3[2] = "흐림";
		for(int i = 0 ; i < 3 ; i ++)
		{
			System.out.println(arr3[i]);
		}
		
		char arr4[] = new char[] {'A', 'B', 'C'};
		for(int i = 0 ; i < 3 ; i ++)
		{
			System.out.println(arr4[i]);
		}
		

	}
}
