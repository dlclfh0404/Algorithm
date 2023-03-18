import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				System.out.print(String.valueOf(c).toLowerCase());
			}else {
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
	}

}