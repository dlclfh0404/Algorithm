import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            for(int j=N-i; j<N; j++){
                System.out.print(" ");
            }
            for(int k=i; k<N; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}