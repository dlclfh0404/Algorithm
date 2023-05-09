import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; // 숫자를 담을 배열
		int sum = 0; // 합을 더할 변수
		
		for(int i = 0; i < 5; i++) { // 입력 및 총합 구하기
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println(sum/5); // 평균
		Arrays.sort(num); // 정렬
		System.out.println(num[2]); // 3번째 값이 대표값
		sc.close();
	}
}