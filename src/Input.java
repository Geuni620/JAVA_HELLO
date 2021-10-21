import java.util.Scanner;
public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번째 사용자가 입력한 값은 ? ");
		int first = scanner.nextInt();
		return first;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 ? ");
		String symbol = scanner.next();
		return symbol;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("두 번째 사용자가 입력한 값은 ? ");
		int second = scanner.nextInt();		
		return second;
	}
}
