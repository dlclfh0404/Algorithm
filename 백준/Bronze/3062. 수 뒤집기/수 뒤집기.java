import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int n) {
        // 주어진 수가 대칭수인지 판별하는 메서드
        String numStr = Integer.toString(n);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력받기
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            // 수 입력받기
            int num = scanner.nextInt();

            // 수를 뒤집은 값과 원래 값의 합 구하기
            int reversedNum = Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString());
            int total = num + reversedNum;

            // 합이 대칭수인지 판별하여 결과 출력하기
            if (isPalindrome(total)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}