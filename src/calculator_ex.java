import java.util.Scanner;
public class calculator_ex {
	public static void main(String[] args) {
	System.out.println("첫 번째 숫자 : ");
	Scanner scanner = new Scanner(System.in);
	int first = scanner.nextInt();
	
	int result = first;
	while (true) {
		System.out.println("사칙연산은 ? ");
		String symbol = scanner.next();
	
		if("quit".equals(symbol)) {
			System.out.println("최종 결과 값은 " + (result));
			break;
		}	
		System.out.println("두 번째 숫자 : ");
		int second = scanner.nextInt();	
		
		if("+".equals(symbol)) {
			result = result + second;
			System.out.println(result);
		}
		else if("-".equals(symbol)) {
			result = result - second;
			System.out.println(result);
		}
		else if("*".equals(symbol)) {
			result = result * second;
			System.out.println(result);
		}
		else if("/".equals(symbol)) {
			result = result / second;
			System.out.println(result);
		}
		else {
			System.out.println("사용자가 잘못 입력하셨습니다");
		}
		
		}
	}
}
