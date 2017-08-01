package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;

		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		
		Scanner sc = new Scanner(System.in);
		
		String answer = null;
		do {
			int tryNum;
			int repeatNum=1;
			
			System.out.println(correctNumber);
			
			System.out.println("숫자를 맞춰보세요.(1~100)");
			while(true){
				
				System.out.print(repeatNum+"번째 시도>> ");
				
				boolean valid = true;
				do {
					tryNum = sc.nextInt();
					
					if(tryNum<minNumber || tryNum>maxNumber){
						System.out.println("범위 내의 값으로 다시 입력해주세요.");
						valid = false;
					}else{
						valid =true;
					}
				} while (valid==false);
				
				if(correctNumber == tryNum){
					System.out.println("정답입니다!");
					break;
				}else{
					if(correctNumber < tryNum){
						System.out.println("더 낮게");
						maxNumber = tryNum-1;
					}else{
						System.out.println("더 높게");
						minNumber = tryNum+1;
					}
					
					System.out.println(minNumber+"~"+maxNumber);
				}
				
				repeatNum++;
				
			}
			
			System.out.print("다시 하시겠습니까?(y/n)");
			answer = sc.next();
			
		} while (answer.equals("y") || answer.equals("Y"));
	}
}