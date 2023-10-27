import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] time;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(bf.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            time = new int[N + 1];

            ArrayList<Integer>[] list = new ArrayList[N];
            int[] indegree = new int[N + 1];
            st = new StringTokenizer(bf.readLine());

            for (int i = 0; i < N; i++) {
                list[i] = new ArrayList<>();
                time[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(bf.readLine());

                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());

                list[s - 1].add(e - 1);
                indegree[e - 1]++;
            }

            int w = Integer.parseInt(bf.readLine()); // 건물 번호

            bw.write(Sort(indegree, list, w)+ "\n");
        }
        bw.flush();
        bw.close();
        bf.close();
    }

    public static int Sort(int[] indegree, ArrayList<Integer>[] list, int w) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] result = new int[N + 1];

        // 건문 기본 소요 시간
        for(int i = 0; i < N; i++) {
            if (indegree[i] == 0) {
                result[i] = time[i];
                queue.offer(i);
            }
        }

        // 총 소요 시간 = 이전 건물까지의 소요시간 + 현재 건물 소요시간
        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int i : list[node]) {
                result[i] = Math.max(result[i], result[node] + time[i]);
                indegree[i]--;

                if(indegree[i] == 0) {
                    queue.offer(i);
                }
            }
        }
        return result[w - 1];
    }
}