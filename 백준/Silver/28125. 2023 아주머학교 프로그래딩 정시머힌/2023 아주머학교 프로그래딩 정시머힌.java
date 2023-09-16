package main;

import java.io.*;    
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 	빠른 입,출력을 위해서 bf, bw 선언, 
		 	문자열을 이어붙이기 위한 sb, 
		 	문자열을 특정 구분자를 기준으로 분리할 st
		*/
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     StringBuilder sb = new StringBuilder();
	     StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine()); // 해석을 반복할 횟수 N
		
		/*
			char형 배열로 만들어 받아오는 줄을 char배열로 변환에 저장 -> 문자 단위로 처리하기위해서
			역슬래시의 개수를 셀 변수 : cnt1 ||  @, [, !, ;, ^, 0, 7,\',\\'를 셀 변수 : cnt2
			@ : a
			[  : c
			! : i
			; : j
			^ : n
			0 : o
			7 : t
			v : \'
			w : \\'
			검사하면서 해당하는 cnt1 , cnt2를 증가 시키고, sb1에 그 문자를 저장
			\\를 받아오면 cnt1를 증가
			* \ : 에러 \\ : \
			바꾼문자의 개수가 원래 문자열의 길이의 절반 이하이면
			I don't understand를 출력 아니라면 원래 문자열 출력
			// 검사할 변수를 밖에다가 꺼내게 되면 오류남.
		 */
		
		
		for(int i = 0; i < N; i++) {
			char[] ch = bf.readLine().toCharArray();
			
			int cnt1 = 0;
			int cnt2 = 0;
			StringBuilder sb1 = new StringBuilder(); // 암호를 변환 및 저장하는데 사용
			for(char ch1 : ch) {                          // ch 배열을 순회
				 if (ch1 == '@') {
	                    cnt2++;
	                    sb1.append('a');
	                } else if (ch1 == '[') {
	                    cnt2++;
	                    sb1.append('c');
	                } else if (ch1 == '!') {
	                    cnt2++;
	                    sb1.append('i');
	                } else if (ch1 == ';') {
	                    cnt2++;
	                    sb1.append('j');
	                } else if (ch1 == '^') {
	                    cnt2++;
	                    sb1.append('n');
	                } else if (ch1 == '0') {
	                    cnt2++;
	                    sb1.append('o');
	                } else if (ch1 == '7') {
	                    cnt2++;
	                    sb1.append('t');
	                } else if (ch1 == '\\') {
	                    cnt1++;
	                } else if (cnt1 == 1 && ch1 == '\'') {
	                    cnt1 = 0;
	                    cnt2++;
	                    sb1.append('v');
	                } else if (cnt1 == 1 && ch1 == '\\') {
	                    cnt1++;
	                } else if (cnt1 == 2 && ch1 == '\'') {
	                    cnt1 = 0;
	                    cnt2++;
	                    sb1.append('w');
	                } else {
	                    // 암호가 아닌 경우
	                   sb1.append(ch1);
	                }
	            }
			
			int length = sb1.length(); // 받아온 문자열의 길이 
			if (length % 2 == 1) { // 길이가 홀수인 경우에는 짝수로 만듬. 이렇게 하는 이유는 이후 조건을 비교할 때 홀수와 짝수의 경우를 처리하기 위함
				length += 1;
			}
			
			// 바꾼문자의 개수가 원래 문자열의 길이의 절반 이하이면 I don't understand를 출력, 아니면 변환 문자열 출력
			if (length / 2 <= cnt2) {
				sb.append("I don't understand").append('\n');
			} else {
				sb.append(sb1).append('\n');
			}
		}
		
		// sb에 담긴 문자열을 출력
		bw.write(sb.toString());
		bw.close();
	}

}
