import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int total=0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			total += a * b;
		}
		if(total == X) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}