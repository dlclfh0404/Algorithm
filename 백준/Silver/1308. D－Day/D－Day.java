import java.util.*;
public class Main {
	static int[] dayCase1(int year) { // 윤년
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) day[1] = 29;
		return day;
	}
	// 첫날짜(1,1)부터 해당 날짜까지의 날짜수를 합함
	static long dayCasefind(int year, int month, int day) {
		long days = 0;
		int[] date;
		for(int i = 1; i < year; i++) {
			date = dayCase1(i);
			for(int j = 0; j < 12; j++) {
				days += date[j];
			}
		}
		date = dayCase1(year);
		for(int i = 0; i < month-1; i++) {
			days += date[i];
		}
		days += day;
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 오늘 날짜
		int year1 = sc.nextInt();
		int month1 = sc.nextInt();
		int day1 = sc.nextInt();
		// 해당 날짜
		int year2 = sc.nextInt();
		int month2 = sc.nextInt();
		int day2 = sc.nextInt();
		
		// gg 판단
		if((year2 - year1 > 1000) || (year2 - year1 == 1000 && month2 > month1) || (year2 - year1 == 1000 && month2 == month1 && day2 >= day1)) {
			System.out.println("gg"); 
		}else {
			long finddays1 = dayCasefind(year1, month1, day1);
			long finddays2 = dayCasefind(year2, month2, day2);
			System.out.println("D-" + (finddays2 - finddays1));
		}
	}
}