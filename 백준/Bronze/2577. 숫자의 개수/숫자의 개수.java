import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt()); // 받을때 곱해버려서 받음
		String str = Integer.toString(value); // 문자열 치환
		sc.close();
		
		for(int i = 0; i < 10; i++) {
			int cnt = 0; 
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j)- '0')==i) { //문자열 분리
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}