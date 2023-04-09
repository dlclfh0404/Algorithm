import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		/* 아주 간단한 계산기
		 1. 두 개의 자연수 a, b는 1부터 9까지의 자연수이다. (1 ≤ a, b ≤ 9)
		 2. 사칙연산 + , - , * , / 순서로 연산한 결과를 출력한다.
		 3. 나누기 연산의 결과에서 소수점 이하의 숫자는 버린다.
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d\n%d\n%d\n%d\n", a + b, a - b, a*b, a / b);
	}
}