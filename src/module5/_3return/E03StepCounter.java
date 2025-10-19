package module5._3return;

/*
 * A pedometer estimates that taking 2000 steps is the same as walking
 * one mile. Write a method convertToMiles that takes in a parameter
 * for steps and returns the number of miles walked. Then, call
 * the method from the main() method to test a few values.
 */
public class E03StepCounter {
    
	//add convertToMiles method here
    public static double convertToMiles(int steps) {
        double milesWalked = (double)steps/2000;
        return(milesWalked);
    }

    public static void main(String[] args) {
        System.out.println("Miles walked: " + convertToMiles(7000));
        System.out.println("500 steps is equal to " + convertToMiles(500) + " miles");
        System.out.println("2000 steps is equal to " + convertToMiles(2000) + " miles");
        System.out.println("3000 steps is equal to " + convertToMiles(3000) + " miles");
       //add 2 more method calls here for 2000 and 3000 steps.

    }
}
