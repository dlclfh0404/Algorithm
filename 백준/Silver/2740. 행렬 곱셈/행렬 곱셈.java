import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		// A행렬 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			for(int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(bf.readLine(), " ");
		
		// B행렬 입력
		st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		
		int[][] B = new int[M][k];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			for(int j = 0; j < k; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//행렬 계산 및 출력
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < k; j++) {
				int sum = 0;
				for(int K = 0; K < M; K++) {
					sum += A[i][K] * B[K][j];
				}
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}