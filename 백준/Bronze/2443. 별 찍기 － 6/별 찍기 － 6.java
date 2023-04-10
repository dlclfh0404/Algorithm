import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		// 1번째 for
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j < i; j++) { // 공백찍기
				System.out.print(" ");
			}
			for(int k = (2*star)-(i*2-1); k > 0; k--) { // 별찍기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}