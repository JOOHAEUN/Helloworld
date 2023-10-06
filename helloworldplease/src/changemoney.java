import java.util.Scanner;

public class changemoney {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		int i=0;
		int []unit = {50000, 10000,5000,1000,500,100,50,10,1};
		//배열 선언과 생성 및 초기화
		System.out.println("Output");
		System.out.println();
		System.out.print("input price(won): ");
		
		int cash = stdin.nextInt();//숫자 입력 받기 
		
		for(i=0;i<unit.length;i++)//배열의 길이 만큼 반복
		{
			int num=cash/unit[i];//입력 받은 숫자를 배열의 요소로 나눔
			
			System.out.println(unit[i]+":"+num); //num 값 출력
			cash-=num*unit[i];//반복할 때마다 입력받은 값에서 이미 계산해준 값 빼기
		}
				
	}
	
}
