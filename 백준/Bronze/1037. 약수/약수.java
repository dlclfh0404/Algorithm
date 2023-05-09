import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(N-- > 0) {
			int temp = sc.nextInt();
			if(temp > max) max = temp;
			if(temp < min) min = temp;
		}
		System.out.println(max * min);
	}

}