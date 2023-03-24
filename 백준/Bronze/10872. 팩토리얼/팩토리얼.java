import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 1;
		
		for(int i = 1; i <= n; i++) {
			n1 *= i;
		}
		System.out.println(n1);
	}
}