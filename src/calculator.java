//계산기 구현
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		System.out.println("사용자가 입력한 값은  : ");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt(); //첫 번째 값 저장 
		
		//TODO 두 번째 값을 입력 받아 저장
		int second = scanner.nextInt(); //두 번째 값 저장
		
		//TODO 입력 받은 두 값에 대한 사칙연산을 계산해 출력
		System.out.println(first + second);
	}
}