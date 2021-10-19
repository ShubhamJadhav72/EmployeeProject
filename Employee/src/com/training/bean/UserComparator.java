package com.training.bean;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
	public int compare(User s1, User s2)
	{
		return (int) (s1.getUserid()-s2.getUserid());
	}
}
