import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		// revers사용하기위해, 문자열뒤에 추가, 문자열 뒤집기 , 문자열로 바꾸기
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		 // 둘 중 무엇이 큰지 비교하고 큰거 출력
		System.out.println(A > B ? A : B);
	}
}