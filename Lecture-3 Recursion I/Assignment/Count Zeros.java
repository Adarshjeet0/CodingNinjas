
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
		if(input == 0){
			return 1;
		}
		
		return helper(input);

	}

	public static int helper(int input){
		if(input == 0){
			return 0;
		}
		int m = input%10;
		int n = 0;
		if(m == 0){
			n = 1;
		}
		input/=10;
		return n+helper(input);
	}
}
