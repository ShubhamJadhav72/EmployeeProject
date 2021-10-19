package com.training.bean;

import java.util.Scanner;

public class UserServie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ab=new Scanner(System.in);
		//System.out.println("\nEnter Choice");
		int choice;
		UserTreeSet treeSetopt=new UserTreeSet();
		
		do
		{	
			System.out.print("\nEnter Choice");
			System.out.print("\n1.AddEmployee");
			System.out.print("\n2.displayAllEmployee");
			System.out.print("\n3.SearchEmployee ");
			System.out.print("\n0.Exit ");
			
			choice=ab.nextInt();
			switch(choice)
			{
				case 1: treeSetopt.addNewEmployee();
						break;
				case 2: treeSetopt.displayAllPhoneBook();
						break;
				case 3: treeSetopt.searchOpertion();
						break;
				default:
					System.out.println("\nInvalid ");
			}	
			
		}while(choice!=0);
	


	}

}
