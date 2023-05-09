import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(num);
		for(int i = 0; i < N; i++) {
			sb.append(num[i]).append('\n');
		}
		System.out.println(sb);
	}
}