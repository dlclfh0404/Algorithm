import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int width = 3; // 제곱수 임. 3,5,9,17,33 2+(2-1)
		int[] md = new int[16];
		for(int i = 1; i < md.length; i++) { // 1~15
			md[i] = width * width;
			width = width + (width-1);
		}
		System.out.println(md[N]);
		sc.close();
	}
}