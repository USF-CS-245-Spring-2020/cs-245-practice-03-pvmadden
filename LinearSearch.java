//
// Tom Sawyer Software
// Copyright 2007 - 2020
// All rights reserved.
//
// www.tomsawyer.com
//


public class LinearSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
}
