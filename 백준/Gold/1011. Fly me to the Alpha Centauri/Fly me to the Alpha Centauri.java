import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int km = y - x; // 거리
			
			int max = (int)Math.sqrt(km); // 소수정 내다 버림
			
			if(max == Math.sqrt(km)) {
				System.out.println(max * 2 - 1);
			} else if(km <= max * max + max) {
				System.out.println(max * 2);
			} else {
				System.out.println(max * 2 + 1);
			}
		}
    
	}

}
