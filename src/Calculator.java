import java.util.Scanner;
public class Calculator{
	static int calculator(int first, int second, String symbol) {
		int result = 0;
		if(symbol.equals("+")) {
			result = first + second;
			System.out.println("덧셈 : " + (result));
		} else if (symbol.equals("-")) {
			result = first - second;
			System.out.println("뺄셈 : " + (result));
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.println("곱셈 : " + (result));
		} else if (symbol.equals("/")) {
			result = first / second;
			System.out.println("나눗셈 : " + (result));
		} else {
			System.out.println("사용자가 잘못 입력하셨습니다." );
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = Input.getFirstValue(scanner);
		
		int result = first;
		while(true) {
			String symbol = Input.getSymbol(scanner);
			if("quit".equals(symbol)) {
				System.out.println(result);
				break;
			}
			int second = Input.getFirstValue(scanner);
			
			result = calculator(result, second, symbol);
		}
		scanner.close();
	}
}