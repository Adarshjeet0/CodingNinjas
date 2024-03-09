import java.util.Arrays;
public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
		Arrays.sort(arr);
		int count = 1;
		for(int i = 0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				count++;
			}else{
				if(count == 1){
					return arr[i];
				}else{
					count = 1;
				}
			}
		}
		return arr[arr.length-1];
	}
}