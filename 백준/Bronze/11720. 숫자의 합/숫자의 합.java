import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // for문에서 이 숫자 만큼 돌립니다.
        String str = sc.next(); // 문자열에 담아주기(공백없이)
        int sum = 0; // 합을 담을 변수
        
        for(int i = 0; i < n; i++){
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);  
    }
}