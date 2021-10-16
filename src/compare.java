public class compare {
	public static void main(String[] args) {
		String a = "abcd";
		String b = new String("abcd");
		
		if(a == b) {
			System.out.println("두 개의 값이 같습니다");
		}
		else {
			System.out.println("두 개의 값이 다릅니다");
		}
		if(a.equals(b)) {
			System.out.println("두 개의 값이 같습니다");
		}
		else {
			System.out.println("두 개의 값이 다릅니다");
		}
	}
}
