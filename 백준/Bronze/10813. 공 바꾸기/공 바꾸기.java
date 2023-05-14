import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bag = new int[N];

        for (int i = 0; i < N; i++) {
            bag[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int temp = bag[a-1];
            bag[a-1] = bag[b-1];
            bag[b-1] = temp;
        }
        bf.close();

        for (int k : bag)
            System.out.print(k + " ");
    }
}