import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Long n = Long.parseLong(bf.readLine());
		
		System.out.println(n*(n-1)/2);
		System.out.println('2');
	}
}