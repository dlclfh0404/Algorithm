import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		boolean b; //n번째와 n+1번째 비교
		int cnt = 0; // 개수세기
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		for(int i = 0; i < arr.length; i++) {
			b = false;
			for(int k = i+1; k <arr.length; k++) {
				if(arr[i]==arr[k]) {//하나씩 비교
					b = true; //같을경우 참으로
					break;
				}
			}
			if(b == false) { //거짓일때 하나씩 증가
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}