import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // 출력할 결과를 저장

        Stack<Integer> st = new Stack<>(); //stack 만들어줌
        
        int n = sc.nextInt(); // stack 크기 입력받기

        int start = 0;

        // 입력받은 수 만큼 반복
        while(n -- > 0){

            int val = sc.nextInt(); // 수열 받기

            if(val > start){
                // start + 1부터 입력받은 val 까지 push
                for(int i = start + 1; i <= val; i++){
                    st.push(i);
                    sb.append('+').append('\n'); // push일때 출력할 + 저장
                }
                start = val; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            // 위에 있는 원소가 입력받은 값이랑 같지 않을때
            else if(st.peek() != val){
                System.out.print("NO");
                System.exit(0); // 탈출 
            }

            st.pop(); 
            sb.append('-').append('\n'); // pop일때 출력할 - 저장

        }

        System.out.println(sb);
    }
}
