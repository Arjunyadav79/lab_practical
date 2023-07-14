package arjun;
import java.util.Scanner;
public class Greatestno {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		// to accept the three values from the user 
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		//To Check which no is greatest by using if else
		if(n1>n2 && n1>n3 ) {
			System.out.println(" The Greatest is "+n1) ;
		}
		 else if(n2>n3&&n2>n1) {
			 System.out.println(" The Greatest is "+n2) ;
		 }
		 else {
			 System.out.println(" The Greatest is "+n3) ;
		 }
	

	}

}