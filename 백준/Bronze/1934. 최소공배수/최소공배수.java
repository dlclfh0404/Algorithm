import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = gcd(a, b);
			
			sb.append(a * b / result).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b; // 나머지 구하기
			
			// gcd(a,b) = gcd(b, r) 변환
			a = b;
			b = r;
		}
		return a;
	}

}