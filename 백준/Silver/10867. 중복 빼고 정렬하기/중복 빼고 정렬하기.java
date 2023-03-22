import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 중복제거
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i = 0; i < n; i++) {
			hashSet.add(sc.nextInt()); // 입력시 자동으로 중복제거
		}
		// 정렬을 하기 위해 ArrayList에 값을 넣는다.
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
		Collections.sort(arrayList); // 오름차순 정렬
		
		StringBuilder sb = new StringBuilder(); // 동작속도 향상
        for (int i : arrayList){
            sb.append(i).append(" "); // 중복제거
        }
        System.out.println(sb.toString());
	}

}