import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
	             
			if(H < 0) {
	  			H = 23;
			}
	             
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
			
		
		
	}

}