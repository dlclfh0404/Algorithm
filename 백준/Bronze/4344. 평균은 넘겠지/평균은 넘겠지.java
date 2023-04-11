import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int c = sc.nextInt(); 
		
		for(int i = 0; i < c; i++) {
			int n = sc.nextInt(); // 학생 수 입력 
			arr = new int[n]; // 학생 수 만큼의 배열 생성
			double sum = 0; //합계 넣어줄 곳
			
			for(int j = 0; j < n; j++) { //성적 입력부분
				int grade = sc.nextInt(); //성적을 입력받아 grade에 저장
				arr[j] = grade; //변수 grade 값을 변수 j에 저장
				sum += grade; // sum + grade 한값을 sum에 저장
			}
			
			double avg = sum / n ; //평균을 담을곳
			double cnt = 0; // 평균 넘는 학생 수를 저장하는 변수
			
			for(int k = 0; k < n; k++) { //평균 넘는 학생 비율 찾기
				if(arr[k] > avg) { // 평균을 넘을경우
					cnt++; // cnt 증가
				}
			}
			System.out.printf("%.3f%%\n",(cnt/n)*100); // 평균 넘는 학생과 학생수를 나눈 후 * 100한 결과 값을 소수점 3번째 자리까지
		}
	}
}