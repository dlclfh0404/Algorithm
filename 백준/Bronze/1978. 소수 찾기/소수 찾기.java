import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int decimal;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			decimal = sc.nextInt();
			for(int j = 2; j <= decimal; j++) {
				if(j == decimal) {
					cnt++;
				}if(decimal % j == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}