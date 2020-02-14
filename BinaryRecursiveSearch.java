//
// Tom Sawyer Software
// Copyright 2007 - 2020
// All rights reserved.
//
// www.tomsawyer.com
//


public class BinaryRecursiveSearch implements Practice03Search
{
	public int search(int [] arr, int target)
	{
		int min = 0;
		int max = arr.length-1;

		return binSearch(arr, target, min, max);
	}

	int binSearch(int [] arr, int target, int min, int max)
	{
		int mid = (min + max) / 2;

		if (min > max)
		{
			return -1;
		}

			//System.out.println(mid + " " + min + " " + max + " " + target);

			if (arr[mid] == target)
			{
				return mid;
			}
			else if (arr[mid] < target)
			{
				return binSearch(arr, target, mid + 1, max);
			}
			else
			{
				return binSearch(arr, target, min, mid - 1);
			}
	}
}
