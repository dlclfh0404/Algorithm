import java.util.Scanner;

public class Main {
	static int N; // 캠퍼스 크기 가로
	static int M; // 캠퍼스 크기 세로
	
	static char[][] cam; // 캠퍼스
	static boolean[][] visit; // 방문화깅ㄴ
	
	static int[] dx = { -1, 1, 0, 0 }; // 상하좌우 
	static int[] dy = {0, 0, -1, 1 }; // 상하좌우
	
	static int result = 0; // 만나는 사람 수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();  // 캠퍼스 크기 가로
		M = sc.nextInt(); // 캠퍼스 크기 세로
		
		cam = new char[N][M]; // 캠퍼스
		visit = new boolean[N][M]; // 방문 체크
		
		// 도연이 위치 저장 변수
		int r = 0;
		int c = 0;
		
		// 캠퍼스 입력
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			for(int j = 0; j < M; j++) {
				cam[i][j] = s.charAt(j);
				// 도연이 위치가 있으면 저장
				if(cam[i][j] == 'I') {
					r = i;
					c = j;
				}
			}
		}
		
		//DFS
		DFS(r,c);
		
		// 만난 사람이 없으면 TT
		if(result == 0) System.out.println("TT");
		// 만난 사람이 있으면 result 출력
		else System.out.println(result);
	}
	
	public static void DFS(int x, int y) {
		visit[x][y] = true;
		
		if(cam[x][y] == 'P') result++;
		
		for(int i =0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			
			if(nx >= 0 && ny >= 0 && nx<N && ny<M && !visit[nx][ny]) {
				if(cam[nx][ny] != 'X') {
					DFS(nx,ny);
				}
			}
		}
	}

}
