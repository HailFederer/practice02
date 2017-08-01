package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액 : ");
		Scanner scanner = new Scanner( System.in  );
		int money = scanner.nextInt();
		
		for(int i=0; i<MONEYS.length; i++){
			if(money >= MONEYS[i]){
				System.out.println(MONEYS[i]+"원 : "+money/MONEYS[i]+"개");
				money = money%MONEYS[i];
			}
		}

		scanner.close();
 	}
}