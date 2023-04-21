import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0; // 소수의 합을 저장할 변수
		int min = 1000000; // 소수들 중에서 최소값을 저장할 곳
		int M = Integer.parseInt(bf.readLine());
		int N = Integer.parseInt(bf.readLine());
		
		for(int i = M; i <= N; i++) { // 소수 구하기
			boolean check = true;  // 소수일때 true , 아닐때 false
			if(i == 1) { // 1은 소수아님.
				continue;
			}
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					check = false;
				}
			}
			if(check) { //소수일 때
				sum+=i; // 소수의 합 누적
				if(min > i) { // 최솟값 구하기
					min = i;
				}
			}
		}
		if(min == 1000000) { // 소수값이 없을때 -1을 출력
			System.out.println(-1);
		}else {
			System.out.println(sum); // 소수의 합
			System.out.println(min); // 소수들중의 최솟값
		}
	}
}