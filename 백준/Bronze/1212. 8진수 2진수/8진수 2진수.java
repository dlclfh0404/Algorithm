import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
		String str = bf.readLine();
		for(int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - '0';
			String s = Integer.toBinaryString(n);
			if(s.length() == 3) {
				sb.append(s);
			}
			else if(s.length()==2 && i!=0) {
				sb.append("0" + s);
			}
			else if(s.length()==1 && i!=0) {
				sb.append("00" + s);
			}
			else
				sb.append(s);
		}
		System.out.println(sb.toString());
	}
}