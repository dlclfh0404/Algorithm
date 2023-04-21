import java.util.*;
import java.io.*;

public class Main {

	public static void solve() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int D = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int a = P>Q?P:Q;
		int b = P>Q?Q:P;
		if(b == 1 || b == 2 && D % 2 == 0 || D % a == 0 || D % b == 0) {
			System.out.println(D);
			return;
		}
		int limit = D/a+1;
		int answer = a - 1;
		HashSet<Integer> hash = new HashSet<>();
		for(int i = 0; i <= limit; i++) {
			int remain = D-a*i;
			if(remain > 0 && remain % b == 0) {
				System.out.println(D);
				return;
			}
			if(remain < 0) remain += b;
			int tmp = b - remain % b;
			
			if(hash.contains(tmp)) break;
			hash.add(tmp);
			if(answer > tmp) answer = tmp;
		}
		System.out.println(D+answer);
	}
	public static void main(String[] args) throws Exception{
		new Main().solve();
	}
}