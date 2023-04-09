import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		/* 정수 N 의 모든 약수를 오름차순으로 출력한다.
		   입력 받은 수를 for문으로 돌려서 1개씩 증가 했을때
		   if N입력받은수와 i증가하는 수가 나누었을때 0이면 출력
		 */
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 for(int i = 1; i <= N; i++) {
			 if(N % i == 0) {
				 System.out.print(i+" ");
			 }
		 }
	}
}