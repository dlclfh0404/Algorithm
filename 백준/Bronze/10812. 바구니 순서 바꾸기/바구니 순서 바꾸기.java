import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N + 1];
		int[] basket2 = new int[N + 1];
		
		for(int i = 1; i <= N; i++ ) {
			basket[i] = i;
			basket2[i] = i;
		}
		
		String in;
		StringTokenizer st1;
		int i,j,k;
		
		for(int s = 0; s < M; s++) {
			in = bf.readLine();
			st1 = new StringTokenizer(in);
			i = Integer.parseInt(st1.nextToken());
			j = Integer.parseInt(st1.nextToken());
			k = Integer.parseInt(st1.nextToken());
			int i2 = i;
			
			for(int n = 0; n < j - i + 1; n++) {
				if(k + n <= j) {
					basket2[n + i] = basket[k + n];
				}else {
					basket2[n + i] = basket[i2];
					i2++;
				}
			}
			
			for(int g = 1; g <= N; g++) {
				basket[g] = basket2[g];
			}
		}
		
		for(int s = 1; s <= N; s++) {
			bw.write(basket2[s] + " ");
		}
		bf.close();
		bw.flush();
		bw.close();
	}
}