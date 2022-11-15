package Practice1115.ex02;   //chapter05.ex02; Ex01 복습

public class Practice2 {

	public static void main(String[] args) {
		// <문제> arr1 배열 변수에 정수 1000개의 방을 만든다
		// for 문을 사용해서 각 방에 3의 배수의 값을 저장
		//
		
		int[] arr1 = new int[1000];
		for(int i = 0; i <1000 ; i++)
		{
					arr1[i]=(i+1)*3;
					System.out.print(arr1[i] + " ");
		}

	}

}
