
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
		if(k==0){
			return 1;
		} 
		return helper(k,0);
	}

	public static double helper(int k, int i){
		if(i == k+1){
			// double result = Math.pow(2, i);
			// return 1/result;
			return 0;
		}
		double result = Math.pow(2, i);
		return 1/result + helper(k, i+1);
		
	}
}
