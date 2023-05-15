import java.util.*;
import java.io.*;
public class Main {
	
	private static long lansun(long lan[], int N, long max) {
		long h = 0;
		long min = 1;
		
		while(min <= max) {
			h = (min + max)/2;
			long cnt = 0;
			
			for(long num : lan) {
				cnt += num /h;
			}
			// 원하는 랜선 갯수보다 잘라진게 적을 경우
			// 하나의 랜선길이가 길어서 더 짧게  h 보다 아래의 수
			if(cnt < N) {
				max = h - 1;
			}
			// 원하는 랜선 갯수보다 잘라진게 많을 경우
			// 하나의 랜선길이가 짧아서 더 길게 h 보다 위의 수
			else {
				min = h + 1;
			}
		}
		return (max+min)/2;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		long result = 0;
		long max = 0;
		
		long[] lan = new long[K];
		for(int i = 0; i < K; i++) {
			lan[i] = Integer.parseInt(bf.readLine());
			max = Math.max(max, lan[i]);
		}
		
		result = lansun(lan, N, max);
		
		System.out.println(result);
		bf.close();
	}

}