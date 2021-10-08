package Gugudan;

public class Euclidean {	
	public static void main(String[] args) {
		double[] a = {-1,2,3};
		double[] b = {4,0,-3};
		
		calcEuclideanDist(a,b);
		}
	public static void calcEuclideanDist(double[] a, double [] b) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += Math.pow(a[i]-b[i], 2);
		}
	
	// 일단 변수차들의 제곱을 더하고
	System.out.println("sum:" + sum);
	
	//루트를 씌우면 유클리드 거리가 됨
	System.out.println("Euclidean Distance:" + Math.sqrt(sum));
	}
}

