import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[] truth;
	static int[] parent;
	static List<int[]>party_list = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		int truth_number = Integer.parseInt(st.nextToken());
		if(truth_number == 0) {
			System.out.println(M);
			System.exit(0);
		}
		else {
			truth = new int[truth_number];
			for(int i = 0; i < truth_number; i++) {
				truth[i] = Integer.parseInt(st.nextToken());
			}
			
			parent = new int[N+1];
			init();
			
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(bf.readLine());
				int party_number = Integer.parseInt(st.nextToken());
				if(party_number == 0) {
					party_list.add(new int[] {});
					continue;
				}
				int [] temp = new int[party_number];
				int val = Integer.parseInt(st.nextToken());
				temp[0] = val;
				for(int j = 1; j < party_number; j++) {
					int item = Integer.parseInt(st.nextToken());
					temp[j] = item;
					if(val < temp[j]) union(val, item);
					else union(item, val);
				}
				party_list.add(temp);
			}
			int ans = 0;
			for(int[] temp : party_list) {
				boolean flag = false;
				for(int item : temp) {
					if(!check(item)) {
						flag = true;
						break;
					}
				}
				if(!flag) ans++;
			}
			System.out.println(ans);
		}
	}
	static public void init() {
		for(int i = 1; i <= N; i++) {
			parent[i] = i;
		}
	}
	static public int find(int x) {
		if (x == parent[x]) return x;
		else return parent[x] = find(parent [x]);
	}
	static public void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) parent[y] = x;
	}
	static public boolean check(int x) {
		x = find(x);
		for(int item : truth) {
			if(x == find(item)) return false;
		}
		return true;
	}
}