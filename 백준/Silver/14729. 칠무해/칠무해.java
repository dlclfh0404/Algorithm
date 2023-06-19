import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 시간초과를 방지하기위해

		int n = Integer.parseInt(bf.readLine()); // 학생 수 입력
		float[] score = new float[n]; // 학생들의 성적을 담을 배열 생성

		for(int i = 0; i < score.length; i++){
        score[i] = Float.parseFloat(bf.readLine()); // 학생 성적 배열 저장
    }

		Arrays.sort(score); // 학생들의 성적 오름차순 정렬 

		for(int i = 0; i < 7; i++){
			 System.out.printf("%.3f\n", score[i]);
    }
  }
} 