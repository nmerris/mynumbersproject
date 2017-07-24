package mypackage;

public class Numbers {

	public static void main(String[] args) {
		// this program prints out all numbers between 1 and 100
		// if the number is even, the output will indicate so
		
		for(int i = 1; i <= 100; i++)
			if(i % 2 == 0) // i is even
				System.out.println(i + " is an even number");
			else 
				System.out.println(i); // i is odd
		
		}
		
}


