import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0; // 그룹 단어의 개수
		
		for(int i = 0 ; i < N; i++) {
			String str = sc.next();
			boolean check[] = new boolean[26]; // 알파벳의 갯수 만큼 배열로 만들어 사용내역 만큼의 배열
			boolean temp = true; // 그룹 단어 인지 확인
			
			for(int j = 0; j < str.length(); j++) {
				int index = str.charAt(j)-'a';
				if(check[index]) { // 이전에 사용한적이 있는 문자라면
					if(str.charAt(j) != str.charAt(j-1)) { // 이전 문자와 연속되지 않는다면
						temp = false; //그룹단어가 아님
						break;
					}
				}else { // 이전에 사용한적이 없는 문자라면
					check[index] = true; //문자 사용을 체크
				}
			}
			if(temp) cnt++;
		}
		System.out.println(cnt);
	}
}