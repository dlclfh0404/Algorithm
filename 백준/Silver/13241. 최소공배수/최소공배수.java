import java.util.*;
public class Main {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long gcd = gcd(Math.max(a,  b), Math.min(a, b));
		
		System.out.println((a*b)/gcd);
	}
	
	public static long gcd(long a, long b) {
		while(b > 0) {
			long temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
}