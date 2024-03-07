
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int[] output = new int[0];
		return indices(input,0,output,x,0);
		
	}

	public static int[] indices(int[] arr, int startindex, int[] output, int x,int index){
		if(startindex>=arr.length){
			return output;
		}
		if(arr[startindex] == x){
			int[] res = new int[output.length+1];
			for(int i = 0;i<output.length;i++){
				res[i] = output[i];
			}
			res[index++] = startindex;
			return indices(arr, startindex+1, res, x,index);
		}
		return indices(arr, startindex+1, output, x,index);
	}
	
}