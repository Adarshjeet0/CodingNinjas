
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
		if(input == 0){
			return 0;
		}
		int m = input%10;
		input/=10;
		return m+sumOfDigits(input);

	}
}
