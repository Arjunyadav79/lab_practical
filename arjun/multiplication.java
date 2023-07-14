package arjun;

import java.util.*;
public class multiplication {


	public static void main(String[] args) {
		int i,num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num=sc.nextInt();
		
		// Using For Loop for getting multiplication table
		for(i=1;i<=10;i++) {
			System.out.println(num+"×"+i+"="+i*num);
		}

	}

}


	