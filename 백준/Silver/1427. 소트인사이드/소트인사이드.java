import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		char[] ch = N.toCharArray();
		Arrays.sort(ch);
		
		//내림차순
		for(int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
		}	
	}
}