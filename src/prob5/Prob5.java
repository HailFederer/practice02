package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	
	public static void randomGame() {
		
		Scanner sc = new Scanner(System.in);
		
		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;

		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		
		int tryNum;
		int repeatNum=1;
		
		System.out.println(correctNumber);
		
		System.out.println("수를 결정하였습니다. 맞춰보세요.");
		while(true){
			System.out.println(minNumber+"-"+maxNumber);
			System.out.print(repeatNum+"번째 시도>> ");
			
			tryNum = sc.nextInt();
			
			if(correctNumber == tryNum){
				System.out.println("정답입니다!");
				break;
			}else if(tryNum<minNumber || tryNum>maxNumber) {
				System.out.println("범위 내의 값으로 다시 입력해주세요.");
				continue;					
			}else if(correctNumber < tryNum){
					System.out.println("더 낮게");
					maxNumber = tryNum-1;
			}else if(correctNumber > tryNum){
					System.out.println("더 높게");
					minNumber = tryNum+1;
			}
			repeatNum++;
		}		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			randomGame();
			System.out.print("다시 하시겠습니까?(y/n)");
			if("n".equals(sc.next())) {
				break;
			}
		}
		sc.close();
	}
}