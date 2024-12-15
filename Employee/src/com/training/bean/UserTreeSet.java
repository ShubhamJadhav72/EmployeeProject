package com.training.bean;

import java.util.Scanner;
import java.util.TreeSet;

public class UserTreeSet {
	

	static Scanner kb=new Scanner(System.in);

	TreeSet<User> treeSet=new TreeSet<User>(new UserComparator());
	
public void addNewEmployee() {
	System.out.println("Enter Employee No ");
	int userid=kb.nextInt();
		System.out.println("Enter Employee Name:");
		String userName=kb.next();
		System.out.println("Enter Employee gmail:");
		String userEmail=kb.next();
		treeSet.add(new User(userid, userName,userEmail));
		System.out.println("Add operation Perform======>>>");
	}

void displayAllPhoneBook() {
	if(treeSet.size()==0) {
		System.out.println("IS Empty");
	}else 
	{
		 for(User ele: treeSet)
	        {
	            System.out.print(ele.getUserid()+" "+ele.getUserName()+" "+ele.getUserEmail());
	            System.out.println();
	        }
	}
}


void searchOpertion() {
	int flag=0;
	if(treeSet.size()==0) {
		System.out.println("IS Empty");
	}else {
		System.out.println("Enter name you want to search ");
		String str=kb.next();
		for(User ele: treeSet)
        {
			if(ele.getUserName().equals(str)) {
				System.out.print(ele.getUserid()+" "+ele.getUserName()+" "+ele.getUserEmail());
            System.out.println();
            flag=1;
            }
			else {
				
			}
        }
		if(flag==0) {
			System.out.println("not found");
		}
	}
}
}
