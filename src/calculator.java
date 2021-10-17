//계산기 구현
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값 : ");
		int first = scanner.nextInt();
		
		System.out.println("사칙연산 기호 : ");
		String symbol = scanner.next();
		
		System.out.println("두 번째 입력 값 : ");
		int second = scanner.nextInt();
		
		System.out.println("사칙연산 기호 : ");
		symbol = scanner.next();
		
		System.out.println("세 번째 입력 값 : ");
		int third = scanner.nextInt();
		
				if("+".equals(symbol)) {
					System.out.println("덧셈" + (first + second + third));
				}
				else if ("-".equals(symbol)) {
					System.out.println("뺄셈" + (first - second - third));
				}
				else if("*".equals(symbol)) {
					System.out.println("곱셈" + (first * second * third));
				}
				else if("/".equals(symbol)) {
					System.out.println("나눗셈" + (first / second / third));
				}
				else {
					System.out.println("사용자가 잘못 입력하셨습니다.");
				}
	}
}
