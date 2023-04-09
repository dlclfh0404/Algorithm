import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		/* N줄 덧셈
		   1부터 주어진 숫자만큼 모두 더한 값을 출력하시오
		   ex)
		   주어진 숫자가 10 일 경우 출력해야 할 정답은,
		   1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0; // N까지 더한수를 담을 변수
		for(int i = 1; i <= N; i++) {
			sum = sum + i; 
		}
		System.out.print(sum);
	}
}