
public class CastingTest {
	public static void main(String args[]) {
		byte b=120;
		int i =b;
		System.out.println("확대형 변환: "+i);
		int j=259;
		double d= 259.428;
		System.out.println("축소 형 변환 결과");
		b=(byte)j;
		System.out.println("int259를 byte로 :"+b);
		i=(int) d;
		System.out.println("double 259.428를 int로 :"+i);
		b=(byte) d;
		System.out.println("double 259.428를 byte로 :"+b);
		
		
				
				
				
	}

}
