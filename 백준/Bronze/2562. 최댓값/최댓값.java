import java.util.*;
public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int size = arr.length;
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++) {
			if(arr[max]<=arr[i]) {
				max = i;
				cnt = i;
			}
		}
		System.out.println(arr[max]);
		System.out.println(cnt+1);
    }
}