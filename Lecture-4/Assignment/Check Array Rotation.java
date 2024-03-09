public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        if(arr.length == 1 || arr.length == 0){
            return 0;
        }
        boolean flag = false;
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
                flag = true;
                break;
            }else{
                count++;
            }
        }
        if(flag){
            return count;
        }else if(count+1 == arr.length){
            return 0;
        }
        return count+1;
    }

}