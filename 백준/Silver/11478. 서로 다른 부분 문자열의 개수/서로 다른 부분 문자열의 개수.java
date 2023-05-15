import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		HashSet<String> set = new HashSet<>();
		
		String name = "";
		
		for(int i = 0; i < str.length(); i++) {
			name="";
			// 중복 제거
			for(int j = i; j < str.length(); j++) {
				name += str.substring(j, j+1);
				set.add(name);
			}
		}
		System.out.println(set.size());
	}

}