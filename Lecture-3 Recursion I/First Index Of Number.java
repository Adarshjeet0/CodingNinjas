
public class Solution {
	static int count = 0;
	public static int firstIndex(int arr[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int n = arr.length;
		if(n<=0){
			
			return -1;
		}
		if(arr[0] == x){
			return count;
		}
		int subarr[] = new int[n-1];
		for(int i = 1;i<n;i++){
			subarr[i-1] = arr[i]; 
		}
		count++;
		return firstIndex(subarr, x);

		
	}
	
}