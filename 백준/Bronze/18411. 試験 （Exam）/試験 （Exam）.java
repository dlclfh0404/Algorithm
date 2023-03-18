import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] N = new int[3];
        for(int i = 0; i < N.length; i++) {
        	N[i] = sc.nextInt();
        }
        Arrays.sort(N);
        int S = N[1] + N[2];
        System.out.println(S);  	
	}

}