import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		//-1로 a ~ z까지 값을 넣어줌
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		String str = sc.nextLine();
		//for 문을 입력받은 길이만큼 돌림
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // 문자들을 한글자씩 저장
			if(arr[ch - 'a'] == -1) { 
					arr[ch - 'a'] = i; 
					/*ex) arr[c - 'a'] = 0 -> arr[2] = 0
					arr[e - 'a'] = 1 -> arr[4] -> 1 */
			}
		}
		for(int v : arr) {
			System.out.print(v + " ");
		}
    }
}