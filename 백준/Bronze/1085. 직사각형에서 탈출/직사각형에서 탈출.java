import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min_x = Math.min(x, w-x); //x축 최소거리
		int min_y = Math.min(y, h-y); //y축 최소거리
		
		// x와 y축 최소거리 중 가장 작은값
		System.out.println(Math.min(min_x, min_y));
	}
}