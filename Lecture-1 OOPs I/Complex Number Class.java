/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply.....
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
	private int real;
	private int img;

	public ComplexNumbers(int real, int img){
		this.real = real;
		this.img = img;
	}
	public void SetReal(int real){
		this.real = real;
	}

	public int getReal(){
		return real;
	}

	public void setImg(int img){
		this.img = img;
	}

	public int getImg(){
		return img;
	}
	public void print(){
		
		System.out.println(real+" + "+"i"+img);
	}

	public void plus(ComplexNumbers c){
		this.real = this.real + c.real;
		this.img = this.img + c.img;
	}

	public void multiply(ComplexNumbers c){
		int newReal = this.real * c.real + this.img * c.img * (-1);
		int newImg = this.img * c.real + this.real * c.img;
		this.real = newReal;
		this.img = newImg;
	}
	
}
