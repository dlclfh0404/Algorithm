import java.io.*;
import java.util.*;

public class Main {
	static int n,m,cnt; // 몇번째 인지?
	static int[] visited; // 연결된 노드
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	
	public static void dfs(int x) {
		visited[x]=cnt;//순차정함
		for(int i = 0; i < graph.get(x).size();i++) {
			int y = graph.get(x).get(i); // 연결된 노드
			if(visited[y]==0) {
				cnt++; // 순차 증가
				dfs(y); // dfs 실행
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		n = Integer.parseInt(st.nextToken()); // 정점 개수
		m = Integer.parseInt(st.nextToken()); // 간선 개수
		int r = Integer.parseInt(st.nextToken()); // 처음 노드
		for(int i = 0; i < n+1; i++) {
			graph.add(new ArrayList<Integer>()); // 연결된 노드 초기화
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine()," ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		for(int i = 0; i < graph.size(); i++) {
			Collections.sort(graph.get(i)); // 노드마다 오름차순
		}
		cnt = 1;
		visited =new int[n+1];
		dfs(r);
		for(int i = 0; i < visited.length; i++) {
			if(i!=0) System.out.println(visited[i]);
		}
	}
}
