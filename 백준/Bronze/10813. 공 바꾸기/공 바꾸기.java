import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() , M = sc.nextInt();
		int[] bag = new int[N+1]; // 0부터 출력을 방지
		for(int i = 1; i <= N; i++) {
			bag[i] = i; // 증가값을 배열에 하나씩 넣기
		}
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int temp = bag[a];
			bag[a] = bag[b];
			bag[b] = temp;
		}
		for(int j = 0; j < N; j++) {
			System.out.print(bag[j+1]+" ");
		}
	}
}