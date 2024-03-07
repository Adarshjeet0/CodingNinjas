public class Solution {
	
	public static boolean checkNumber(int arr[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int n = arr.length;
		if(n<=1){
			if(arr[0] == x){
				return true;
			}
			return false;
		}
		if(arr[0] == x){
			return true;
		}
		int subarr[] = new int[n-1];
		for(int i = 1;i<=n-1;i++){
			subarr[i-1] = arr[i];
		}
		return checkNumber(subarr, x);
		
		
	}
}