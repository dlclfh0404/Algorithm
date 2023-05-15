import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0 ; i < a; i++) { 
			A.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < b; i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		int sum = 0;
		for(int num : A) {
			if(!B.contains(num)) {
				sum += 1;
			}
		}
		
		for(int num : B) {
			if(!A.contains(num)) {
				sum += 1;
			}
		}
		
		System.out.println(sum);
		
	}

}