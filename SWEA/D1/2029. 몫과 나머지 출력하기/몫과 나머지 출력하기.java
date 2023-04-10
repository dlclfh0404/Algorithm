import java.util.Scanner;
class Solution{
	public static void main(String[] args){
		/*몫과 나머지 출력하기
        몇번 만큼할건지 입력을 받고 
        두 수를 입력받아 몫과 나머지 출력*/
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("#%d %d %d\n",i,a/b,a%b);
		}
	}
}