import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            index.add(x);
        }

        while (!index.isEmpty()) {
            int x = index.poll();
            int cnt = 0;
            while (x != q.peek()) {
                int qA = q.poll();
                q.add(qA);
                cnt++;
            }
            result += Math.min(cnt, q.size() - cnt);
            q.poll();
        }
        System.out.println(result);
    }
}