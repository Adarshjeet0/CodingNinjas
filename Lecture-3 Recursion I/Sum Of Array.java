public class Solution {

	public static int sum(int input[]) {
		int n = input.length;
		if(n <=1){
			return input[0];
		}
		int[] subarray = new int[n-1];
		for(int i = 0;i<n-1;i++){
			subarray[i] = input[i];
		}
		return input[n-1] + sum(subarray);
	}
}