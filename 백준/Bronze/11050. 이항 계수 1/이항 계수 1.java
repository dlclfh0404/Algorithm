import java.util.*;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		// nCk = n! / ((n-k)! * k!)
		System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
	}
 
	static int factorial(int N) {
		// factorial(0) == 1 이다. 
		if (N <= 1)	{
			return 1;
		}
		return N * factorial(N - 1);
	}
}