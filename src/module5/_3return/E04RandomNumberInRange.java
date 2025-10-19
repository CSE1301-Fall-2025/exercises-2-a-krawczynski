package module5._3return;

/*
 * Exercise: Write a method randomNumberInRange() that takes in two
 * integer parameters, min and max, and returns a random integer value
 * from within that range (inclusive). Test your method by calling it
 * from the main method.
 */
public class E04RandomNumberInRange {
	//add your method here
	public static int randomNumberInRange(int max, int min) {
		int randomInteger = (int)(Math.random() * (max - min + 1)) + min;
		return(randomInteger);
	}

	public static void main(String args[]) {
		//test your method by calling it
		System.out.println(randomNumberInRange(10, 2));
		System.out.println(randomNumberInRange(1000000, 50));
	}
}
