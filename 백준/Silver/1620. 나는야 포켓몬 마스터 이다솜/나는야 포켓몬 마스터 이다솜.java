import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> HashMap1 = new HashMap<>();
		HashMap<String, Integer> HashMap2 = new HashMap<>();
		
		for(int i = 1; i < n + 1; i++) {
			String s = bf.readLine();
			HashMap1.put(i , s);
			HashMap2.put(s, i);
		}
		for(int i = 0; i < m; i++) {
			String temp = bf.readLine();
			// 숫자인지 판별
			if(temp.chars().allMatch(Character :: isDigit)) {
				sb.append(HashMap1.get(Integer.parseInt(temp))).append("\n");
			} else {
				sb.append(HashMap2.get(temp)).append("\n");
			}
		}
		System.out.println(sb);

	}

}