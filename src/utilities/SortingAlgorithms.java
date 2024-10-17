package utilities;

import shapes.ShapeComparator;
import shapes.ThreeDShape;

public class SortingAlgorithms
{

	/**
	 * A method to be used within Sort methods. This method will swap the position
	 * of two shapes within a given array.
	 * 
	 * @param array An array of Shape objects.
	 * @param i     The position of the first shape.
	 * @param j     The position of the second shape.
	 */
	public static void Swap(ThreeDShape[] array, int i, int j)
	{
		ThreeDShape temp = array[i]; // stores the first shape in a temporary object
		array[i] = array[j]; // moves the second shape to the first's position
		array[j] = temp; // places the shape from the temporary object into the second's position
	}

	/**
	 * A method that uses a Bubble Sort algorithm to sort an array of shapes from
	 * largest to smallest based on height.
	 * 
	 * @param array An unsorted array of Shape objects.
	 */
	public static void BubbleSort(ThreeDShape[] array)
	{
		int n = array.length;
		for (int i = 0; i < n; i++) // second pass through the array
		{
			for (int j = 0; j < n; j++) // first pass through the array to compare the values with the next value
			{
				if (array[i].compareTo(array[j]) > 0)
				{
					// moves the larger value to the left
					Swap(array, i, j);
				}
			}
		}
	}

	/**
	 * A method that uses a Bubble Sort algorithm to sort an array of shapes from
	 * largest to smallest based on their volume and area of their base.
	 * 
	 * @param array   An unsorted array of Shape objects.
	 * @param shpComp An object to invoke the compare method.
	 */
	public static void BubbleSort(ThreeDShape[] array, ShapeComparator shpComp)
	{
		int n = array.length;
		for (int i = 0; i < n; i++) // second pass through the array
		{
			for (int j = 0; j < n; j++) // first pass through the array to compare the values with the next value
			{
				if (shpComp.compare(array[i], array[j]) > 0)
				{
					// moves the larger value to the left
					Swap(array, i, j);
				}
			}
		}
	}

	/**
	 * A method that uses an Insertion Sort algorithm to sort an array of shapes
	 * from largest to smallest based on height.
	 * 
	 * @param array An unsorted array of Shape objects.
	 */
	public static void InsertSort(ThreeDShape[] array)
	{

		int n = array.length;
		for (int i = 1; i < n; i++)
		{
			ThreeDShape temp = array[i]; // gets the starting position
			int j = i - 1;
			while (temp.compareTo(array[j]) > 0 && j >= 0) // second arg is to keep j from out of bounds
			{
				// moves the position ahead if it is larger
				Swap(array, j, j+1);
				j = j - 1;
			}
			array[j + 1] = temp; // places the value once nothing larger is found

		}
	}

	/**
	 * A method that uses an Insertion Sort algorithm to sort an array of shapes
	 * from largest to smallest based on their volume and area of their base.
	 * 
	 * @param array   An unsorted array of Shape objects.
	 * @param shpComp An object to invoke the compare method.
	 */
	public static void InsertSort(ThreeDShape[] array, ShapeComparator shpComp)
	{

		int n = array.length;
		for (int i = 1; i < n; i++)
		{
			ThreeDShape temp = array[i]; // gets the starting position
			int j = i - 1;
			while (shpComp.compare(temp, array[j]) > 0 && j >= 0) // second arg is to keep j from going out of bounds
			{
				// moves the position ahead if it is larger
				Swap(array, j, j+1);
				j = j - 1;
			}
			array[j + 1] = temp; // places the value once nothing larger is found

		}
	}

	/**
	 * A method that uses a Selection Sort algorithm to sort an array of shapes from
	 * largest to smallest based on height.
	 * 
	 * @param array An unsorted array of Shape objects.
	 */
	public static void SelectionSort(ThreeDShape[] array)
	{
		int n = array.length;
		for (int i = 0; i < n; i++)
		{
			int temp = i; // temporary position of loop
			for (int j = i + 1; j < n; j++)
			{
				if (array[temp].compareTo(array[j]) < 0) // compares to find the larger element
					temp = j;
			}
			Swap(array, i, temp); // moves the found element to position of the loop
		}
	}

	/**
	 * A method that uses a Selection Sort algorithm to sort an array of shapes from
	 * largest to smallest based on their volume and area of their base.
	 * 
	 * @param array   An unsorted array of Shape objects.
	 * @param shpComp An object to invoke the compare method.
	 */
	public static void SelectionSort(ThreeDShape[] array, ShapeComparator shpComp)
	{
		int n = array.length;
		for (int i = 0; i < n; i++)
		{
			int temp = i; // temporary position of loop
			for (int j = i + 1; j < n; j++)
			{
				if (shpComp.compare(array[temp], array[j]) < 0) // compares to find the larger element
					temp = j;
			}
			Swap(array, i, temp); // moves the found element to position of the loop
		}
	}
}
