import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()]; 
        for(int i = 0; i < arr.length; i++){ // 1,2,3,4,5생성
            arr[i]+=i+1;
        }

        int M = sc.nextInt(); // 몇번 바꿀건지
        for(int s = 0; s < M; s++){
            int j = sc.nextInt()-1;
            int k = sc.nextInt()-1;
            while(j < k){
                int temp = arr[j];
                arr[j++] = arr[k];
                arr[k--] = temp;
            }
        }
        for(int S = 0; S < arr.length; S++){
            System.out.print(arr[S]+" ");
        }

        
    }
}