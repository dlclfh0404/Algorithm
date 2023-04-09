import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		/*
		  펠린드롬인지 확인하기 --> 문자열이 거꾸로 해도 같은것
		  StringBuilder 클래스 내에 있는 reverse() 메소드를 사용. 
		  reverse()는 문자열을 서로 뒤집어 주는 역할 하기때문에 
		  우리는 같은지 검사만 검사할때는 equals()로  
          StringBuilder에서 String을 반환할 때는 toString() 메소드를 사용
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(bf.readLine());
		 
        bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
        bf.close();
	}
}