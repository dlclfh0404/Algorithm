import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int start = 1; // 거리
		int cnt = 2; // 범위
		
		if(N == 1) {
			System.out.println(1);
		}else {
			while(cnt <= N) {
				cnt = cnt + (6 * start); // 6씩 증가하면
				start++;
			}
			System.out.println(start);
		}
	}
}