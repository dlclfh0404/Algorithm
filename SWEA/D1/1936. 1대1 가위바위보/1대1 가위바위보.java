import java.util.Scanner;
class Solution{
	public static void main(String[] args) {
		/*
	    가위: 1, 바위: 2, 보: 3

	    a, b 입력 받는다.
	    보 > 바위 > 가위 > 보 : 3 > 2 > 1 > 3
	    가위 > 보 : 1 > 3
	    바위 > 가위 : 2 > 1
	    보 > 바위 : 3 > 2
	 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A == 1 && B == 3) { // 가위 VS 보
			System.out.println('A');
		}else if(A == 2 && B == 1) { // 바위 VS 가위
			System.out.println('A');
		}else if(A == 3 && B == 2) { // 보 VS 바위
			System.out.println('A');
		}else { // 다른경우에는 다 지는거니깐
			System.out.println('B');
		}
	}
}