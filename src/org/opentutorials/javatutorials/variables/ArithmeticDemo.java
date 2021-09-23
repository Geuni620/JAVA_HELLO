package org.opentutorials.javatutorials.variables;

public class ArithmeticDemo {

	public static void main(String[] args) {
		//resut 의 값은 3
		int result = 1 + 2;
		System.out.println(result);
		
		//result 의 값은 2
		result = result -1;
		System.out.println(result);

		//result 의 값은 4
		result = result +2;
		System.out.println(result);
		
		//result 의 값은 2
		result = result/2;
		System.out.println(result);
		
		//result 의 값은 10
		result = result +8;
		System.out.println(result);
		
		//result 의  값은 3
		result = result%7;
		System.out.println(result); //%는 나머지를 구하는 연산자다
	}

}
