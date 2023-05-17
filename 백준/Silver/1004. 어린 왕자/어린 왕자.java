import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, n, a, b, c, d, e, f, r, cnt;
		T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			n = sc.nextInt();
			cnt = 0;
			for(int j = 0; j < n; j++) {
				e = sc.nextInt();
				f = sc.nextInt();
				r = sc.nextInt();
				if(Math.pow(a - e, 2) + Math.pow(b - f, 2) < Math.pow(r, 2)&&Math.pow(c - e, 2) + Math.pow(d - f, 2) < Math.pow(r, 2)) {
					continue;
				}else if(Math.pow(a - e, 2) + Math.pow(b - f, 2) < Math.pow(r, 2) || Math.pow(c - e, 2) + Math.pow(d - f, 2) < Math.pow(r, 2)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}