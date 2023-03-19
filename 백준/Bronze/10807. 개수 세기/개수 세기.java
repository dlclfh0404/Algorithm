import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int cnt = 0; // 똑같은 수는 증가시켜서 받는변수
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
		int cnt1 = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==cnt1) {
				cnt++;
			}
		}
		System.out.print(cnt);	
	}
}