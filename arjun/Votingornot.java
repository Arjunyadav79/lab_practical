package arjun;
import java.util.Scanner;
public class Votingornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Task 1: Accept age and check eligible for voting or not
        System.out.println("Enter your age:");
        int age = sc.nextInt(); 
        if (age >= 18) { 
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting.");
        }
	}

}
