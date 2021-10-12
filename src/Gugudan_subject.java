//최종 요구사항 1 만들어보기
import java.util.Scanner;
public class Gugudan_subject {
	public static int[] calculate(int times) {
		int[] result = new int[8];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("사용자가 입력할 값은 ?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값은 : " + number);
		
		for(int i = 1; i < 9; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}
}
