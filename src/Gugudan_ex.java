public class Gugudan_ex {
	//구구단 로직을 구현하는 메서드1
	public static int[] calculate(int times) {
		int[] result =new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	//구구단 로직을 구현하는 메서드2
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
