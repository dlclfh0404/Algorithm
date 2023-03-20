import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double [sc.nextInt()]; //방 크기
		for(int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextDouble(); // 방크기 만큼 입력받기
		}
		
		double sum = 0; // 총합을 넣어줄 변수
		Arrays.sort(arr); // 정렬
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1])*100); // 점수 / 최댓값 * 100 을 넣어줌 sum 변수에
		}
		System.out.println(sum / arr.length); // sum에서 배열의 길이만큼 나눈다.
	}
}