import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			map.put(bf.readLine(), 0);
		}
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			if(map.containsKey(bf.readLine())) cnt++;
		}
		System.out.println(cnt);
	}
}