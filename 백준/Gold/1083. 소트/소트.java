import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int S = Integer.parseInt(bf.readLine());
		int cnt = 0, index = 0;
		while(cnt < S && index < N - 1) {
			int maxNum = arr.get(index), maxIdx = -1;
			
			int idx = index + 1, cnt1 = 1;
			while(cnt + cnt1 <= S && idx < N) {
				int num = arr.get(idx);
				if(num > maxNum) {
					maxNum = num;
					maxIdx = idx;
				}
				cnt1++;
				idx++;
			}
			if(maxIdx != -1) {
				arr.remove(maxIdx);
				arr.add(index, maxNum);
				cnt += maxIdx - index;
			}
			index++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(i).append(' ');
		}
		System.out.println(sb);
		bf.close();
	}

}