import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String[] arr = bf.readLine().split(" ");
		int a1 = Integer.parseInt(arr[0]) , a0 = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(bf.readLine());
		int n0 = Integer.parseInt(bf.readLine());
		
		int result = (a1 * n0 + a0 <= c * n0) && (c >= a1)? 1:0;
		System.out.println(result);
	}

}