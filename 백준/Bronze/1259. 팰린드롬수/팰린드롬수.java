import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = bf.readLine(); //숫자 입력받기
			int n = str.length(); // 숫자 갯수
			boolean T = true;
			if(str.equals("0")) break;
			for(int i = 0; i <= n/2; i++) {
				if(str.charAt(i)!=str.charAt(n-i-1)) T = false; // 앞뒤가 다르면 팰린드롬수 아님
			}if(T) { // 팰린드롬수이면 yes 출력
				sb.append("yes\n");
			}else { // 팰린드롬수가 아니면 no 출력
				sb.append("no\n");
			}
		}
		System.out.print(sb);
	}
}