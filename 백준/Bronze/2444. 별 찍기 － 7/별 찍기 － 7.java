import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < N-i; j++) {
				System.out.print(" "); // 한칸씩 건너뛰기해줌
			}
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		} // 정삼각형 만들어주는 for 문
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*N-2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}// 역삼각형 만들어주는 for문
	}
}