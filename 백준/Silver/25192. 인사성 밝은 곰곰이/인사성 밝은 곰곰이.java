import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int cnt = 0; // enter가 들어오면 증가 될 변수
		
		HashSet<String> hs = new HashSet<>(); 
		
		while(N-- > 0) {
			String person = bf.readLine();
			if(person.equals("ENTER")) { // enter가 들어오면 hashset 새로 만들기
				hs = new HashSet<>();
				continue;
			}
			if(!hs.contains(person)) { // 객체가 존재하면 
				hs.add(person); // 추가 해주고
				cnt++; // 증가
			}
		}
		System.out.println(cnt);
	}
}