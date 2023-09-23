import java.util.*; // 입력 받을 Scanner 라이브러리 선언
public class Main {

	public static void main(String[] args) {
		/*
		 	1. 두 원이 완전히 겹치는 경우 , 접점 갯수 무한 => 중심, 반지름 같음
		 	2. 접점이 없을 때 => 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때
		 							한 원 안에 다른 원이 있으면서 접점이 없을 때
		 	3. 접점이 한 개일 때 => 내접할 때, 외접할 때 
		 */
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 케이스
		
		for(int i = 0; i < t; i++) {
			
			// 조규현
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			// 백승환
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(point(x1, y1, r1, x2, y2, r2));
		}
	}
	
	public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
		// 두 점 사이의 거리 계산
		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		int sum = r1 + r2;
		int abs = Math.abs(r1 - r2);
		
		// 정확히 겹치는 경우
		if(d == 0 && r1 == r2) {
			return -1;
		}
		
		// 두 원이 서로 겹치면서 인접하지 않는 경우
		else if(d < abs) {
			return 0;
		}
		
		// 두 원이 겹치지 않으면서 인접하지도 않는 경우
		else if(d > sum) {
			return 0;
		}
		
		// 두 원이 서로 겹치면서 인접하는 경우
		else if(d == abs) {
			return 1;
		}
		
		// 두원이 서로 겹치지 않지만 인접하는 경우
		else if(d == sum) {
			return 1;
		}
		
		// 두원이 서로 겹치면서 인접하지 않는 경우 
		else {
			return 2;
		}
	}
}