import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());
		if(a + b + c != 180) {
			System.out.println("Error");
		}else {
			if(a == 60 &&b == 60 && c == 60) {
				System.out.println("Equilateral");
			}else if(a == b || b == c || c == a) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
		}

	}

}