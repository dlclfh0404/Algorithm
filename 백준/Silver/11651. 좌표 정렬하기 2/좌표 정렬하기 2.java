import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] num = new int[N][2];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			num[i][1] = Integer.parseInt(st.nextToken());
			num[i][0] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num, (n1, n2) -> { // 람다 형식으로
			if(n1[0] == n2[0] ) {
				return n1[1] - n2[1];
			}else {
				return n1[0] - n2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(num[i][1] + " " + num[i][0]).append('\n');
		}
		System.out.println(sb);
	}
}