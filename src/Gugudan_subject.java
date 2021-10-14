//최종 요구사항 1 만들어보기
import java.util.Scanner;
public class Gugudan_subject {
	public static void main(String[] args) {
		System.out.println("사용자가 입력한 값은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=2; i <= number; i++) {
			for(int j=1; j <= number; j++) {
				System.out.println(i * j);
			}
		}
	}
}