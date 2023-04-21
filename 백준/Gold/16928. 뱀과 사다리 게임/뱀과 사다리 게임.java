import java.io.*;
import java.util.*;

public class Main {
	static int[] board;

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int ladder = Integer.parseInt(st.nextToken()); // 사다리 
		int snake = Integer.parseInt(st.nextToken()); // 뱀

		board = new int[101];
		// 1,2,3,4,...100 자신 인덱스 번호를 원소값으로
		for(int i = 1; i < board.length; i++) {
			board[i] = i;
		}
		
		while (ladder-- > 0) {
			st = new StringTokenizer(bf.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			board[x] = y;
		}
		while (snake-- > 0) {
			st = new StringTokenizer(bf.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			board[x] = y;
		}
		
		int result = bfs(1);
		System.out.println(result);
	}
	
	private static int bfs(int sNode) {
		int[] check = new int[101]; // 방문 순서를 기록하기 위한 배열
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(sNode); // 처음에 인덱스 1 들어감
		check[sNode] = 0;
		
		while(true) {
			int visited = queue.poll();
			// 주사위 1 ~ 6 나오는 경우
			for(int i = 1; i < 7; i++) {
				int nNode = visited + i;
				
				//board 범위 넘으면 무시
				// - check 배열에서 오류 방지를 위해
				if(nNode > 100) {
					continue;
				}
				// check되어있는 경우(방문 한적있는경우)는 무시
				if(check[board[nNode]] == 0 ) {
					queue.offer(board[nNode]);
					check[board[nNode]] = check[visited] + 1;
				}
				if(board[nNode] == 100) {
					return check[100];
				}
			}
		}
	}
}