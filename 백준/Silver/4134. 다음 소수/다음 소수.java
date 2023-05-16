import java.math.*;
import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int i = 0; i < n; ++i) {
      long testValue = sc.nextLong();
      BigInteger nextPrimeNumber = new BigInteger(String.valueOf(testValue));
      
      if (nextPrimeNumber.isProbablePrime(10)) {  // 입력 값이 소수면 그대로 출력 
        System.out.println(nextPrimeNumber);
      } else {  // 입력 값이 소수가 아니면 다음 소수를 구해서 출력
        System.out.println(nextPrimeNumber.nextProbablePrime());
      }
    }
    sc.close();
  }
}
