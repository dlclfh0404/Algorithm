import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		Integer[] num = new Integer[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num,Collections.reverseOrder());
		System.out.println(num[k-1]);
	}
}