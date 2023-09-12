import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int result = 0;
        
        for (int i = 1; i < N; i++) {
            int number = i;
            int sum = 0;

            // 각 자릿수의 합을 계산
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            // 분해합이 N과 같다면 결과에 값을 저장하고 반복을 종료
            if (i + sum == N) {
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}