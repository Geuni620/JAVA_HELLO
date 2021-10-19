import java.util.Scanner;
public class Input {
	public static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번째 입력할 숫자는 ? :");
		//Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		return first;
		
	}
	
	public static int getSecondValue(Scanner scanner) {
		System.out.println("두 번째 입력할 숫자는 ? :");
		int second = scanner.nextInt();
		return second;
	}
	
	public static String getSymbol(Scanner scanner) {
		System.out.println("입력할 사칙연산 기호는 ? :");
		String symbol= scanner.next();
		return symbol;
	}
}
