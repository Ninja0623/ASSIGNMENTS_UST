package exception;

public class MultipleCatchEg {

	public static void main(String[] args) {
		try {
			int arr[]={2,0,4,1,5};
			System.out.println(arr[6]);   //Makes ArrayIndexOutOfBoundsException
			System.out.println(arr[0]/arr[1]); //Makes ArithmeticException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Array Index");
		}catch(ArithmeticException e) {
			System.out.println("Number Cannot devide by zero");
		}

	}

}
