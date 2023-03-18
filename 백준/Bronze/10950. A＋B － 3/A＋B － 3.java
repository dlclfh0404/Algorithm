import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        
	        for(int i = 0; i < N; i++){
	            int A = sc.nextInt();
	            int B = sc.nextInt();
	            arr[i] = A + B;
	        }
	        for(int K : arr) {
	        	System.out.println(K);
	        }
	}
}
