import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			
			int[] arr = new int[n]; // 약수
			int sum = 0; // 약수의 합
			int index = 0; // 배열의 인덱스
			for(int i = 1; i < n; i++) {
				if(n%i==0) { // 약수인 경우
					arr[index++] = i; // 약수를 저장
					sum+=i; // 합
				}
				
			}
			if(sum!=n) {
				System.out.println(n + " is NOT perfect.");
				continue;
			}
			System.out.print(n + " = ");
			for(int i = 0; i < index; i++) {
				if(i == index-1) System.out.print(arr[i]);
				else System.out.print(arr[i] + " + ");
			}
			System.out.println();
		}
		sc.close();
	}
}