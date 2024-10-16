package utilities;

import shapes.Shape;

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
	public static void Swap(Shape[] array, int i, int j)
	{
		Shape temp = array[i]; // stores the first shape in a temporary object
		array[i] = array[j]; // moves the second shape to the first's position
		array[j] = temp; // places the shape from the temporary object into the second's position
	}

	/**
	 * A method that uses a Bubble Sort algorithm to sort an array of shapes from
	 * largest to smallest based on height.
	 * 
	 * @param array An unsorted array of Shape objects.
	 */
	public static void BubbleSort(Shape[] array)
	{
		int n = array.length;
		for (int i = 0; i < n; i++) // second pass through the array
		{
			for (int j = 0; j < n; j++) // first pass through the array to compare the values with the next value
			{
				if (array[i].CompareTo(array[j]) > 0)
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
	public static void BubbleSort(Shape[] array, ShapeCompare shpComp)
	{
		int n = array.length;
		for (int i = 0; i < n; i++) // second pass through the array
		{
			for (int j = 0; j < n; j++) // first pass through the array to compare the values with the next value
			{
				if (shpComp.Compare(array[i], array[j]) > 0)
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
	public static void InsertSort(Shape[] array)
	{

		int n = array.length;
		for (int i = 1; i < n - 1; i++)
		{
			Shape temp = array[i]; // gets the starting position
			int j = i - 1;
			while (array[j].CompareTo(array[i]) > 0)
			{
				// moves the position ahead if it is larger
				Swap(array, j, i);
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
	public static void InsertSort(Shape[] array, ShapeCompare shpComp)
	{

		int n = array.length;
		for (int i = 1; i < n - 1; i++)
		{
			Shape temp = array[i]; // gets the starting position
			int j = i - 1;
			while (shpComp.Compare(array[j], array[i]) > 0)
			{
				// moves the position ahead if it is larger
				Swap(array, j, i);
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
	public static void SelectionSort(Shape[] array)
	{
		int n = array.length;
		for (int i = 0; i < n; i++)
		{
			int temp = i; // temporary position of loop
			for (int j = i + 1; j < n; j++)
			{
				if (array[temp].CompareTo(array[j]) > 0) // compares to find the larger element
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
	public static void SelectionSort(Shape[] array, ShapeCompare shpComp)
	{
		int n = array.length;
		for (int i = 0; i < n; i++)
		{
			int temp = i; // temporary position of loop
			for (int j = i + 1; j < n; j++)
			{
				if (shpComp.Compare(array[temp], array[j]) > 0) // compares to find the larger element
					temp = j;
			}
			Swap(array, i, temp); // moves the found element to position of the loop
		}
	}
}
