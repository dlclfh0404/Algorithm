import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int cnt = 0; //증가를 담는거
		for(int i = 1; i <= N; i++) { //이거까지 돌리고
			String str = Integer.toString(i); // 정수형을 문자열로 바꿉니다.
			for(int j = 0; j < str.length(); j++) { // 문자열 까지 돌립니다. 
				int x = str.charAt(j) - '0'; //자릿수 별로 자름
				if(x == S) { // x랑 이새키 같다면
					cnt++; // 증가
				}
			}
		}
		System.out.print(cnt);
	}
}