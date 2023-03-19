import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean[] Student = new boolean[31];
		for(int i = 1; i < 29; i++) { // 입력 받을곳
			int s = sc.nextInt();
			Student[s] = true; // 값을 1로 고정
		}
		for(int i = 1; i < Student.length; i++) {
			if(Student[i]!=true) { //여기서 입력을 했을때 1이 아니면
				System.out.println(i); // 출력해버리기
			}
		}

	}
}