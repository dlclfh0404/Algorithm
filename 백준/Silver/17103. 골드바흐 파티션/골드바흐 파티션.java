import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		// 소수 구하기 = 소수 false 
		boolean[] num = new boolean[1000001];
		num[0] = num[1] = true;
		for(int i = 2; i * i <= 1000000; i++) {
			if(!num[i]) {
				for(int j = i + i; j <= 1000000; j += i) {
					num[j] = true;
				}
			}
		}
		
		while(n-- > 0) {
			int temp = Integer.parseInt(bf.readLine());
			int result = 0;
			for(int j = 2; j <= temp / 2; j++) {
				if(!num[j] && !num[temp - j]) result++;
			}
			System.out.println(result);
		}

	}

}