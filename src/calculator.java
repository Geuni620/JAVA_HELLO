import java.util.Scanner;
public class calculator{
	static int calculator(int first, String symbol, int second) {
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
		
		int result = Input.getFirstValue(scanner);
		
		while(true) {
			String symbol = Input.getSymbol(scanner);
			
			if("quit".equals(symbol)) {
				Output.print(result);
				break;
			}
			
			int second = Input.getSecondValue(scanner);
			
			result = calculator(result, symbol, second);
		}		
		scanner.close();
	}
}