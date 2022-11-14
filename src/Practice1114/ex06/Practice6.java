package Practice1114.ex06;

public class Practice6 {

	public static void main(String[] args) {
		
		for (int i = 0 ; i < 10; i++)
		{
			//continue;			//continue를 하면 다음 행이 실행 되지 않는다.
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("=========================");
		for (int i = 0; i < 10; i++)
		{
			if (i ==5) 	
			{
			continue;		//5값에서만 실행하지 않기
			}
			System.out.println(i);
		}
		
		pos2: for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if (j == 2) 
				{
					continue pos2;			//2값에서 중단하고 pos2로 for문 상단으로 건너뛰기
				}
				System.out.println(i + " , " + j);
			}
			System.out.println();
		}
		

	}

}
