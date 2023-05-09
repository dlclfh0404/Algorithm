import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr1 = new int[N]; // 원래 배열
		int[] arr2 = new int[N]; // 정렬 할 배열
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>(); //rank를 매겨줄 HashMap
		
		for(int i = 0; i < N; i++) {
			// 정렬할 배열과 원래 배열에 값 삽입
			arr1[i] = arr2[i] = sc.nextInt();
		}
		
		//정렬
		Arrays.sort(arr2);
		
		//정렬된 배열 순회하면서 삽입
		int ranking = 0;
		for(int k : arr2) {
			// 만약 먼저있는 원소가 이미 순위가 정해졌다면
			// 중복은 안되기에 중복이 아닐때만 원소와 순위를 넣어줌
			if(!rank.containsKey(k)) {
				rank.put(k, ranking);
				ranking++; //hashmap에 삽입후 다음 값을 가리키게 1 더해줌
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int j : arr1) {
			int rank1 = rank.get(j);  //원래 배열 원소에 대한 값을 가지고 오기
			sb.append(rank1).append(' ');
		}
		System.out.println(sb);

	}

}