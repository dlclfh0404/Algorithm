import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String str1 = sc.nextLine();
		
		for(int i = 0; i < str.length; i++) {
			if(str1.contains(str[i])) { //문자열에 확인
				str1 = str1.replace(str[i], "!"); //기존 문자에서 바꿀 문자 치환
			}
		}
        System.out.println(str1.length());
	}
}