public class Gugudan_sequence {
	public static void main(String[] args) {
	
	int[] result_final = new int[9];//1단부터 9단까지 저장
	for(int j = 0; j < result_final.length; j++) {
		
		int[] result = new int[9];//9개의 데이터를 저장할 수 있는 배열을 만듬
		for(int i = 0; i<result.length; i++) {
			result[i] = (j+1) *(i+1); //0부터 시작하기 때문에 i가 처음은 0임
	}		
	for(int i=0; i < result.length; i++) {
		 System.out.println(result[i]);
			}
		}
	}
}

	 
//	 int[] times3 = new int[9];
//	 for(int i = 0; i<times3.length; i++) {
//		 times3[i] = 3 *(i+1);
//	 }
//	 for(int i=0; i < times3.length; i++) {
//		 System.out.println(times3[i]);
//	 }
//	 
//	 int[] times4 = new int[9];
//	 for(int i = 0; i<times4.length; i++) {
//		 times4[i] = 4 *(i+1);
//	 }
//	 
//	 for(int i=0; i < times4.length; i++) {
//		 System.out.println(times4[i]);
//	 }
//	}
//}
