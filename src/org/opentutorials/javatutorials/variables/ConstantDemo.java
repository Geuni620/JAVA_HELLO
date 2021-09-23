package org.opentutorials.javatutorials.variables;

public class ConstantDemo {

	public static void main(String[] args) {
		double a = 2.2;//실수형일 경우 double형태로 데이터 타입을 설정하고
		float b = 2.2F;//데이터 타입을 float로 설정하고 싶을 경우 숫자 뒤에 F를 넣어줘야함
		int c = 2147483647;//int는 2,147,483,647까지는 표현되지만 2,147,483,648은 X
		long d = 2147483648L;// long으로 바꿔도 여전히 에러가 발생 Why? 밑에 정리
		byte f = 100;// 에러가 발생하지 않음 why?
	} 
}