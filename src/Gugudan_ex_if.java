//import java.util.Scanner;
//public class Gugudan_ex_if {
//	public static void main(String[] args) {
//		//8~9단 구현
//		System.out.println("구구단 중 출력할 단은? :");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 : " + number);
//
//		if (number < 2) {
//			System.out.println("2 미만으로 입력하셨습니다");
//		}
//		else if (number > 9) {
//			System.out.println("9 초과로 입력하셨습니다");
//		}
//		else {
//				for (int i=1; i<10; i++) {
//					System.out.println(number*i);
//				}
//		}		
//	}
//}

import java.util.Scanner;
public class Gugudan_ex_if{
	public static void main(String[] args){
	//8단~9단 구현
	System.out.println("구구단 중 출력할 단은? : ");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println("사용자가 입력한 값 : " + number);

	if(number < 2){
		System.out.println("2미만으로 입력하셨습니다");
	}
	else if (number > 9){
		System.out.println("9초과로 입력하셨습니다");
	}
	else{
			for(int i = 1; i<10 ; i++){
			System.out.println(number*i);
			}
		}
	}
}
