import java.util.Scanner;
public class calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("사용자가 입력할 첫 번째 값은 ? :");	
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("사용자가 입력할 두 번째 값은? ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
	
	static String getSymbol(Scanner scanner) {
		System.out.println("사용자가 입력한 사칙연산 기호는 ? ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	
	static int calculator(int first, String symbol, int second) {
		int result = 0;
		//사칙연산 기호 값
		if("+".equals(symbol)) {
			result = first + second;
			System.out.println(result);
		}
		else if("-".equals(symbol)) {
			result = first - second;
			System.out.println(result);
		}
		else if("*".equals(symbol)) {
			result = first * second;
			System.out.println(result);
		}
		else if("/".equals(symbol)) {
			result = first / second;
			System.out.println(result);
		}
		else {
			System.out.println("사용자가 잘못 입력하셨습니다.");
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = getFirstValue(scanner);
		
		int result = first;
		while(true) {
			String symbol = getSymbol(scanner);
			
			if("quit".equals(symbol)) {
				System.out.println("결과 값 : " + (result));
				break;
			}
			int second = getSecondValue(scanner);
			
			result = calculator(result, symbol, second);
		}
	}
}
