import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int N = sc.nextInt();
		int temp = 1;
		int ans = 0;
		for(int i = str.length()-1; i >= 0 ; i--) {
			char ch = str.charAt(i);
			if('A' <= ch && ch <= 'Z') {
				ans += (ch-'A'+10)*temp;
			}else {
				ans += (ch-'0')*temp;
			}
			temp *= N;
		}
		System.out.println(ans);
	}
}