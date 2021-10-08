import java.util.Scanner;
public class Scanner_making {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		System.out.println(name+"님의 나이는"+age+"살 입니다.");
	}
}
