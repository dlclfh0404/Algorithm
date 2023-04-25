import java.util.*;
import java.io.*;
public class Main {
	private static int memoization[][] = new int[10001][101];
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1[] = bf.readLine().split(" ");
		int N = Integer.parseInt(str1[0]);
		int M = Integer.parseInt(str1[1]);
		
		int max = max(N,M);
		int min = min(N,M);
		for(int i = 1; i <= max; i++) {
			memoization[i][1] = i;
			if(i <= min) {
				memoization[i][i] = 1;
			}
			if(i >= 3) {
				if(i % 2 == 0) {
					memoization[i][2] = i / 2;
				}else {
					memoization[i][2] = i / 2 + 2;
				}
			}
		}
		dp(max, min);
		
		bw.write(String.valueOf(memoization[max][min]));
		bw.flush();
	}
	private static int dp(int x, int y) {
		int tempMax = max(x, y);
		int tempMin = min(x, y);
		x = tempMax;
		y = tempMin;
		if(memoization[x][y] == 0) {
			int min = 12341234;
			if(x % y == 0) {
				return memoization[x][y] = min(x/y, min);
			}
			if(x >= y * 3) {
				return memoization[x][y] = dp(x-y, y) + 1;
			}
			for(int i = 1; i <= x / 2; i++) {
				min = min(min, dp(x - i, y) + dp(i, y));
			}
			for(int i = 1; i <= y / 2; i++) {
				min = min(min, dp(x, y-i) + dp(x, i));
			}
			return memoization[x][y] = min;
		}else {
			return memoization[x][y];
		}
	}
	private static int max(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	private static int min(int a, int b) {
		if(a < b) {
			return a;
		}else {
			return b;
		}
	}

}