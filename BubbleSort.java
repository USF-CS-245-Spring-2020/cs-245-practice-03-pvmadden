//
// Tom Sawyer Software
// Copyright 2007 - 2020
// All rights reserved.
//
// www.tomsawyer.com
//


public class BubbleSort implements Practice03Sort
{
	public void sort(int[] a)
	{
		int n = a.length;
		boolean sorting = true;

		while (sorting)
		{
			for (int i = 0; i < n - 1; i++)
			{

				sorting = false;

				if (a[i] > a[i + 1])
				{
					int temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;

					sorting = true;
				}
			}
		}
	}
}
