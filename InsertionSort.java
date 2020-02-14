//
// Tom Sawyer Software
// Copyright 2007 - 2020
// All rights reserved.
//
// www.tomsawyer.com
//


public class InsertionSort implements Practice03Sort
{
	public void sort(int [] a)
	{
		System.out.println("insertionSort");
		int n = a.length;
		for(int i = 1; i < n; i++)
		{
			int nextUnsorted = i;
			int backwards = i - 1;

			while (backwards >= 0 && a[backwards] > nextUnsorted)
			{
				//moving elements greater than nextUnsorted ahead  of their current index
				a[backwards + 1] = a[backwards];
				backwards--;
			}

			//which is now sorted
			a[backwards+1] = nextUnsorted;
		}
	}
}
