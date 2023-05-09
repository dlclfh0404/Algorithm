import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[][] person = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			person[i][0] = sc.next(); // 나이
			person[i][1] = sc.next(); // 이름
		}
		
		Arrays.sort(person, new Comparator<String[]>() {
			// 나이 순으로 정렬
			@Override
			public int compare(String[] p1, String[] p2) {
				return Integer.parseInt(p1[0]) - Integer.parseInt(p2[0]);
			}
			
		});
		for(int i = 0; i  < N; i++) {
			System.out.println(person[i][0] + " " + person[i][1]);
		}
	}

}