import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; //검증수가 들어갈 방
		for(int i = 0; i < 5; i++) {
			sum+=Math.pow(sc.nextInt(), 2); // 값을 입력받으면 제곱을 한후에 sum에 넣어줌
		}
		System.out.println(sum%10); // sum에서 나누기 10을 하면 검증수
	}
}