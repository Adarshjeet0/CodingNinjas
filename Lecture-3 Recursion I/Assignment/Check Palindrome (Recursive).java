public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int len = str.length();
        if(len == 1){
            return true;
        }
        return helper(str,0,len-1);
    }

    public static boolean helper(String str, int start, int last){
        
        if(start>=last){
            return true;
        }
        if(str.charAt(start) != str.charAt(last)){
            return false;
        }
        return helper(str, start+1, last-1);

    }
}
