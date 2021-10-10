import java.util.Scanner;
public class Gugudan_ex {
	public static void main(String[] args) {
		System.out.println("사용자가 출력할 값은 ? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 선택한 값은 ? : " + number);
		
		if ( number < 2 ) {
			System.out.println("잘못 입력하셨습니다");
		}
		else if (number > 10) {
			System.out.println("또 잘못 입력하셨어요?");
		}
		else { 
			for(int i=1; i < 10; i++) {
				System.out.println(number*i);
			}			
		}
	}
}