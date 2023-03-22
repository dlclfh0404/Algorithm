import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//공백 기준으로 나눈걸 받아주기.
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println(st.countTokens());
	}
}