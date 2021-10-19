import java.util.Scanner;
public class calculator{
	public static void main(String[] args) {
		System.out.println("첫 번째 입력할 숫자는 ? :");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		System.out.println("첫 번째 입력한 값은 : " + first);
		
		int result = first;
		while(true) {
		System.out.println("입력할 사칙연산 기호는 ? :");
		String symbol= scanner.next();
		System.out.println("사용자가 입력한 사칙연산 기호 :" + symbol);
		
		if("quit".equals(symbol)) {
			System.out.println("최종 결과 값은 : " + result);
			break;
			}
		
		System.out.println("두 번째 입력할 숫자는 ? :");
		int second = scanner.nextInt();
		System.out.println("두 번째 입력한 값은 : " + second);
		
		if("+".equals(symbol)) {
			result = first + second;
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