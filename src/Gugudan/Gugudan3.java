package Gugudan;
import java.util.Scanner;

public class Gugudan3 {
	public static void main(String[] args) {
		//8 - 9 단
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner Scanner = new Scanner(System.in);
		int number = Scanner.nextInt();
		System.out.println("사용자가 입력 한 값 : " + number);
		
		if (number < 2) {
			System.out.println("입력하신 값이 잘못되었습니다.");
		} else if (number > 9) {
			System.out.println("입력하신 값이 잘못되었습니다.");
		} else {
			for(int i = 1; i < 10 ; i++) {
				System.out.println(number * i);
			}
		}
	}
}
		
		
		
		
		
//		// 6단
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1; // i++ 
//		}
//
//		// 7단
//		for(int j = 1; j < 7; j++) {
//			System.out.println(7 * j);

