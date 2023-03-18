import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine())/4;
		System.out.print("long ".repeat(N) + "int");
	}

}