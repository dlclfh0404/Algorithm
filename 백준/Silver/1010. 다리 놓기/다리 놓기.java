import java.util.*;
public class Main {
	
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			// M개중 N개를 뽑는경우 nCr  n = M , r = N
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			sb.append(combination(M, N)).append('\n');
		}
		System.out.println(sb);
	}
	
	static int combination(int n, int r) {
		// 이미 풀린 경우 반환
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		
		// 2번째 경우
		if(n == r || r == 0) {
			return dp[n][r] = 1;
		}
		
		// 1번째 경우
		return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
	}
}