package Practice1114.ex05;						//chapter04.ex07	Break_Control_Keyword 내용

public class Practice5 {

	public static void main(String[] args) {
		
		//일반적인 for문
		int i;
		for (i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("\n==========================\n");
		//break로 중간에 빠져나오기
		for (i = 0; i < 10; i++)
		{
			if ( i == 5 )
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("\n==========================\n");
		
		for (i = 0; i < 10; i++)
		{
			for ( int j = 0; j < 5; j++ ) 
			{
				if ( i == 5 )	//안쪽의 for문만 빠져나오기
				{
					break;
				}
				System.out.println(i + " , "  + j);
			}
		}
System.out.println("\n==========================\n");
		
		pos1 :for (i = 0; i < 10; i++)
				{
					for ( int j = 0; j < 5; j++ ) 
					{
						if ( j == 2 )	//pos로 점프해서 끝내기
						{
							break pos1;
						}
						System.out.println(i + " , "  + j);
					}		
				}
		
		
System.out.println("\n==========================\n");
		
		for (i = 0; i < 10; i++)
		{
			for ( int j = 0; j < 5; j++ ) 
			{
				if ( j == 2 )	
				{
					 i=100;			//변수값에 큰 값을 줘서 끝내기
					break;
				}
				System.out.println(i + " , "  + j);
			}
		}
	}

}
