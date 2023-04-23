import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			// a,b,c 가 모두 0이면 종료
			if(a == 0 && b == 0 && c == 0) break;
			
			// 삼각형 조건을 만족 못하는 경우
			int Max = Math.max(Math.max(a, b), c);
			
			if(Max == a) {
				int sum = b + c;
				
				if(a >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if(Max == b) {
				int sum = a + c;
				
				if(b >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if(Max == c) {
				int sum = a + b;
				
				if(c >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			// 세 수가 모두 다를 경우
			if(a != b && a != c && b != c) {
				System.out.println("Scalene");
				continue;
			}
			
			//a,b,c가 모두 같으면
			if(a == b && a == c && b == c) {
				System.out.println("Equilateral");
				continue;
			}
			
			// 2개의 수만 같을 경우
			if(a == b || a == c || b == c) {
				System.out.println("Isosceles");
				continue;
			}
		}

	}

}