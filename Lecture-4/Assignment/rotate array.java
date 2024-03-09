
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int m;
       if(d == 0 || d== arr.length){
           m = 0;
       }else{
           m = d % arr.length;
       }
       int[] temp = new int[arr.length];
       int index = 0;
       for(int i = m;i<arr.length;i++){
           temp[index++] = arr[i];
       }
       for(int i = 0;i<m;i++){
           temp[index++] = arr[i];
       }

       for(int i = 0;i<arr.length;i++){
           arr[i] = temp[i];
       }
    }

}