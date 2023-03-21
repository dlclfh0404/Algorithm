import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		double dou = 0.0;
		
		switch(str) {
			case "A+":
				dou = 4.3;
				break;
			case "A0":
				dou = 4.0;
				break;
			case "A-":
				dou = 3.7;
				break;
			case "B+":
				dou = 3.3;
				break;
			case "B0":
				dou = 3.0;
				break;
			case "B-":
				dou = 2.7;
				break;
			case "C+":
				dou = 2.3;
				break;
			case "C0":
				dou = 2.0;
				break;
			case "C-":
				dou = 1.7;
				break;
			case "D+":
				dou = 1.3;
				break;
			case "D0":
				dou = 1.0;
				break;
			case "D-":
				dou = 0.7;
				break;
			case "F":
				dou = 0.0;
				break;
		}
		System.out.println(dou);
		
		
	}

}