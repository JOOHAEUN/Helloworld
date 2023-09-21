import java.util.Scanner;//scanner 임포트

public class simple369 {
	public static void main(String[] args) {
		char value;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter integer value 1~99:");//1~99 숫자입력하라는 표시
		
		int i =scanner.nextInt();//숫자 읽기
		if ((i/10==3 || i/10==6 || i/10==9)&&(i%10==3 || i%10==6 || i%10==9))//숫자에 두개의 3이나 6이나 9가 들어갈 때 
			System.out.println("박수짝짝");
		else if ((i/10==3 || i/10==6 || i/10==9) || (i%10==3 || i%10==6 || i%10==9))//숫자에 한개의 3이나 6이나 9가 들어갈 때
			System.out.println("박수짝");
		else //숫자에 3이나 6이나 9 중 아무것도 들어가지 않을 때
			System.out.println("NO 3,6,or 9");
		
		scanner.close();
		
	}

}
