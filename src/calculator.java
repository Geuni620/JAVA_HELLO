import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		System.out.println("첫 번째 입력할 값은 ? : ");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		System.out.println("첫 번째 입력할 값 : " + first);
		
		int result = first;
		while(true) {			
			System.out.println("사칙연산 기호는 ? :");
			String symbol = scanner.next();
			System.out.println("사칙연산 기호 : " + symbol);

			if("q".equals(symbol)) {
				System.out.println("최종 결과 값 : " + result);
				break;
			}
			
			System.out.println("두 번째 입력할 값은 ? : ");
			int second = scanner.nextInt();
			System.out.println("두 번째 입력할 값 : " + second);
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
				System.out.println("사용자가 잘못 입력하셨습니다.");
			}	
		}
	}
}