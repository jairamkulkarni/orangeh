package hbo;

import java.util.Scanner;

public class understand {

	public static void main(String[] args) {
		
		
		
		try (Scanner console = new Scanner(System.in)) {
			int num =1;
			
			System.out.print("Enter any positive integer: ");
			num = console.nextInt();
			        
			System.out.println("Multiplication Table of " + num);
			
			for(int i=1; i<=10; i++)
			{
			    System.out.println(num +" x " + i + " = " + (num*i) );
			}
		}
	}

}
