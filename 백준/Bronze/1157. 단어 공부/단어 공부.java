import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26]; // 영 문자의 개수 만큼의 배열
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			if( 65 <= str.charAt(i) && str.charAt(i) <= 90) { //대문자 범위 A~Z
				arr[str.charAt(i) - 'A']++; // 해당 인덱스의 값 1 증가	
			}
			else {//소문자 범위 a~z
				arr[str.charAt(i) - 'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65); // 대문자로 출력해야해서 65를 더해줌
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}
}