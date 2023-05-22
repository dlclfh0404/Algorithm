import java.io.*;
import java.util.*;
public class Main {
	static int cnt = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken()); // 행
		int c = Integer.parseInt(st.nextToken()); // 열
		int size = (int) Math.pow(2,  N); // 1개 사이즈
		
		find(size, r, c);
		System.out.println(cnt);
	}
	
	private static void find(int size, int r, int c) {
		if(size == 1) return;
		if(r < size / 2 && c < size / 2) {
			find(size/2, r, c);
		}
		else if(r < size / 2 && c >= size / 2) {
			cnt += size * size / 4;
			find(size/2, r, c - size / 2);
		}else if(r >= size/2 && c < size/2) {
			cnt += (size * size / 4) * 2;
			find(size/2, r - size/2, c);
		}
		else {
			cnt += (size * size / 4) * 3;
			find(size/2, r - size/2, c - size/2);
		}
	}

}