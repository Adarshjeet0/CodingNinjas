
public class Solution {

	public static int lastIndex(int arr[], int x) {
		
		int index = arr.length-1;
		return last(arr,x,index);
		
	}

	public static int last(int[] arr, int x, int index){
		if(arr.length <= 0){
			return -1;
		}
		if(arr[index]== x){
			return index;
		}
		int[] sub = new int[arr.length -1];
		for(int i = 0;i<arr.length-1;i++){
			sub[i] = arr[i];
		}
		return last(sub, x, index-1);
	}
	
}