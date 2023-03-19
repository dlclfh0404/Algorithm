import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt(); // 얘부터
			int b = sc.nextInt(); // 얘까지
			int ball = sc.nextInt(); // 얘번의 공을 넣을게...
			
			for(int j = a-1; j < b; j++) {
				arr[j] = ball;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}