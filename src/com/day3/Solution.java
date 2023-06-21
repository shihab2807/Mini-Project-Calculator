package com.day3;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		//MENU DRIVEN PROGRAMMING 

		Scanner scan =new Scanner(System.in);

		//UPCASTING ->ABSTRACTION
		Calculator c1=new CalculatorImpl();

		//INFINITE LOOP
		while(true) {
			
			// to make next looping wait for 1 second
             try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("1:Addition\n2:Substraction");
			System.out.println("3:Multiplication\n4:Division\n5:EXIT");
			System.out.println("Enter choice");
			int choice = scan.nextInt();//1 2 3 4 5 
			
			//local variables does not have default values, so initializing to 0
			 int a=0;
			 int b=0;
			   
			 //accepting a & b only when choice is 1 2 3 4 
			 if (choice>=1 && choice <=4) {
				 System.out.println("enter A value");
					a=scan.nextInt();
					System.out.println("enter b value");
					 b=scan.nextInt();
				 
			 }
			
			

			switch(choice){
			case 1:
				
				System.out.println(c1.add(a,b));
				break;
			case 2:
				
				System.out.println(c1.sub(a,b));
				break;
			case 3:
				
				System.out.println(c1.mul(a,b));
				break;
			case 4:
				
				System.out.println(c1.div(a,b));
				break;
			case 5:
				System.out.println("exit");
				System.exit(0);
			default :
				System.out.println("Invalid choice");


			}
			System.out.println("---------------");
		}


	}

}
