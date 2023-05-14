import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken()); // a번 바구니부터
            int b = Integer.parseInt(st.nextToken()); // b번 바구니까지
            int ball = Integer.parseInt(st.nextToken()); // ball번 공을 넣는다

            for(int j = a-1; j < b; j++)
            {
                arr[j] = ball;
            }
        }
        bf.close();
        for (int k : arr)
            System.out.print(k + " ");
    }
}