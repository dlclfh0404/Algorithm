import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(list);
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}