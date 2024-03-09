public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
		int xor = 0;
		for(int i = 0;i<arr.length;i++){
			xor = xor^arr[i];
		}
		for(int i = 0;i<arr.length-1;i++){
			xor =xor^i;
		}
		return xor;
	}
}