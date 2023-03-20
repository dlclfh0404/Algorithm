import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			int arr = str.length();
			String s_1 = String.valueOf(str.charAt(0));
			String s_2 = String.valueOf(str.charAt(arr-1));
			System.out.println(s_1+s_2);
			
		}
	}
}