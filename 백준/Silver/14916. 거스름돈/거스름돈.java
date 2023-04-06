import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//2원, 5원 거스름돈
		
		//동전 개수 최소
		
		//n : 거스름돈
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		
		while (n>0) {
			//5로 나뉘는 경우
			if (n%5==0) {
				cnt = n/5 + cnt;
				break;
			}
			
			//5로 나뉘지 않으면 2씩 빼기
			n -=2;
			cnt++;
		}
		
		if (n < 0) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
	}
}