import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine()); // 학교의 수, int범위 넘어가서 
		System.out.println(4 * n);
	}
}