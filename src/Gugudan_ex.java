public class Gugudan_ex {
	public static void main(String[] args) {
		int[] result = new int[9];
	for(int j = 0; j < result.length; j++) {
		for(int i=0; i < result.length; i++) {
			result[i] = (j+1) * (i+1);
		}
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
			}
		}
	}
}