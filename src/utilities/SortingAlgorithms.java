package utilities;

import java.util.Arrays;
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
				Swap(array, j, j + 1);
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
				Swap(array, j, j + 1);
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

	// Mostapha's portion

	/**
	 * This method will sort an array of shapes using a merge sort algorithm. This
	 * method will divide the array into two smaller arrays and then sort each half
	 * it will then finally merge these smaller arrays into a single sorted array.
	 * 
	 * @param array The shape objects array.
	 */
	public static void MergeSort(ThreeDShape[] array)
	{
		if (array.length > 1)
		{
			// Here is where we split the array into two parts.
			int mid = array.length / 2;
			ThreeDShape[] left = Arrays.copyOfRange(array, 0, mid);
			ThreeDShape[] right = Arrays.copyOfRange(array, mid, array.length);

			// Sort both halves.
			MergeSort(left);
			MergeSort(right);

			// Merge both halves into a single sorted array.
			merge(array, left, right);
		}
	}

	/**
	 * This method will sort an array of shapes using a merge sort algorithm using
	 * the comparator. This method will divide the array into two smaller arrays and
	 * then sort each half it will then finally merge these smaller arrays into a
	 * single sorted array.
	 * 
	 * @param array   The shape objects array.
	 * @param shpComp An object to invoke the compare method.
	 */
	public static void MergeSort(ThreeDShape[] array, ShapeComparator shpComp)
	{
		if (array.length > 1)
		{
			// Here is where we split the array into two parts.
			int mid = array.length / 2;
			ThreeDShape[] left = Arrays.copyOfRange(array, 0, mid);
			ThreeDShape[] right = Arrays.copyOfRange(array, mid, array.length);

			// Sort both halves.
			MergeSort(left);
			MergeSort(right);

			// Merge both halves into a single sorted array.
			merge(array, left, right, shpComp);
		}
	}

	/**
	 * This is the helper method for our MergeSort method where we merge two sorted
	 * arrays into one singular sorted array.
	 * 
	 * @param array The original array to hold the combined result.
	 * @param left  The left half of the sorted array.
	 * @param right The right half of the sorted array.
	 */
	private static void merge(ThreeDShape[] array, ThreeDShape[] left, ThreeDShape[] right)
	{
		int i = 0, j = 0, k = 0;
		// Merging the left and right array back into our original array.
		while (i < left.length && j < right.length)
		{
			if (left[i].compareTo(right[j]) >= 0)
			{
				array[k++] = left[i++];// Here we add the left element if its bigger or equal.
			} else
			{
				array[k++] = right[j++]; // Here we add the right element if its bigger.
			}
		}
		// Copying any elements that are left in the left array.
		while (i < left.length)
		{
			array[k++] = left[i++];
		}
		// Copying any elements that are left in the right array.
		while (j < right.length)
		{
			array[k++] = right[j++];
		}
	}

	/**
	 * This is the helper method for our MergeSort method where we merge two sorted
	 * arrays into one singular sorted array, using the comparator
	 * 
	 * @param array The original array to hold the combined result.
	 * @param left  The left half of the sorted array.
	 * @param right The right half of the sorted array. * @param shpComp An object
	 *              to invoke the compare method.
	 */
	private static void merge(ThreeDShape[] array, ThreeDShape[] left, ThreeDShape[] right, ShapeComparator shpComp)
	{
		int i = 0, j = 0, k = 0;
		// Merging the left and right array back into our original array.
		while (i < left.length && j < right.length)
		{
			if (shpComp.compare(left[i], right[j]) >= 0)
			{
				array[k++] = left[i++];// Here we add the left element if its bigger or equal.
			} else
			{
				array[k++] = right[j++]; // Here we add the right element if its bigger.
			}
		}
		// Copying any elements that are left in the left array.
		while (i < left.length)
		{
			array[k++] = left[i++];
		}
		// Copying any elements that are left in the right array.
		while (j < right.length)
		{
			array[k++] = right[j++];
		}
	}

	/**
	 * This method will allow us to use the QuickSort algorithm to sort the objects
	 * into an array. This method will pick a pivot element, place larger elements
	 * on the left, and smaller elements to the right, it will then sort these
	 * parts.
	 * 
	 * @param array The shape objects array to be sorted.
	 * @param low   The starting index of the array to be sorted.
	 * @param high  The ending index of the array to be sorted.
	 */
	public static void QuickSort(ThreeDShape[] array, int low, int high)
	{
		if (low < high)
		{
			// Find the correct position for the pivot element.
			int pivotIndex = partition(array, low, high);
			// Sort the parts before and after the pivot.
			QuickSort(array, low, pivotIndex - 1);
			QuickSort(array, pivotIndex + 1, high);
		}
	}

	/**
	 * This method will allow us to use the QuickSort algorithm to sort the objects
	 * into an array using the comparator. This method will pick a pivot element,
	 * place larger elements on the left, and smaller elements to the right, it will
	 * then sort these parts.
	 * 
	 * @param array The shape objects array to be sorted.
	 * @param low   The starting index of the array to be sorted.
	 * @param high  The ending index of the array to be sorted. * @param shpComp An
	 *              object to invoke the compare method.
	 */
	public static void QuickSort(ThreeDShape[] array, int low, int high, ShapeComparator shpComp)
	{
		if (low < high)
		{
			// Find the correct position for the pivot element.
			int pivotIndex = partition(array, low, high, shpComp);
			// Sort the parts before and after the pivot.
			QuickSort(array, low, pivotIndex - 1);
			QuickSort(array, pivotIndex + 1, high);
		}
	}

	/**
	 * This is our helper method will move the elements around the pivot element.
	 * Any element which is larger than the pivot will go to the left, while the
	 * smaller ones will go to the right.
	 * 
	 * @param array The shape objects array to be sorted.
	 * @param low   The starting index of the part of the array to partition
	 * @param high  The ending index of the array to partition
	 * @return The index of the pivot element after partition
	 */
	private static int partition(ThreeDShape[] array, int low, int high)
	{
		// The pivot is the last element in the current array.
		ThreeDShape pivot = array[high];
		int i = (low - 1);// The index of the last element is larger than the pivot.

		// Here we go through each element and compare it to the pivot.
		for (int j = low; j < high; j++)
		{
			if (array[j].compareTo(pivot) >= 0)
			{
				i++;
				// Here we use the swap method to swap any elements that are larger than the
				// pivot.
				Swap(array, i, j);
			}
		}

		// Here we swap the pivot element to the correct position.
		Swap(array, i + 1, high);
		return i + 1;
	}

	/**
	 * This is our helper method will move the elements around the pivot element.
	 * Any element which is larger than the pivot will go to the left, while the
	 * smaller ones will go to the right. This has an overload for the comparator.
	 * 
	 * @param array The shape objects array to be sorted.
	 * @param low   The starting index of the part of the array to partition
	 * @param high  The ending index of the array to partition * @param shpComp An
	 *              object to invoke the compare method.
	 * @return The index of the pivot element after partition
	 */
	private static int partition(ThreeDShape[] array, int low, int high, ShapeComparator shpComp)
	{
		// The pivot is the last element in the current array.
		ThreeDShape pivot = array[high];
		int i = (low - 1);// The index of the last element is larger than the pivot.

		// Here we go through each element and compare it to the pivot.
		for (int j = low; j < high; j++)
		{
			if (shpComp.compare(array[j], pivot) >= 0)
			{
				i++;
				// Here we use the swap method to swap any elements that are larger than the
				// pivot.
				Swap(array, i, j);
			}
		}

		// Here we swap the pivot element to the correct position.
		Swap(array, i + 1, high);
		return i + 1;
	}

	/**
	 * This method will sort an array of shapes based on the heap sort algorithm.
	 * Heap sort works by building a heap which is a binary tree where the largest
	 * element is placed at the top. It will then swap the largest element with the
	 * last element to reduce the size and repeats.
	 * 
	 * @param array The shape objects array to be sorted.
	 */
	public static void HeapSort(ThreeDShape[] array)
	{
		int n = array.length;

		// Here we build the heap by rearranging our array.
		for (int i = n / 2 - 1; i >= 0; i--)
		{
			heapify(array, n, i);
		}

		// Here is where we'll move the largest element to the end and re-heapify our
		// array.
		for (int i = n - 1; i > 0; i--)
		{
			Swap(array, 0, i);// Here we swap the largest element with the last one.
			heapify(array, i, 0);// Here we re-heapify the lower heap.
		}
	}

	/**
	 * This method will sort an array of shapes based on the heap sort algorithm.
	 * Heap sort works by building a heap which is a binary tree where the largest
	 * element is placed at the top. It will then swap the largest element with the
	 * last element to reduce the size and repeats. This method uses the comparator
	 * 
	 * @param array The shape objects array to be sorted. * @param shpComp An object
	 *              to invoke the compare method.
	 */
	public static void HeapSort(ThreeDShape[] array, ShapeComparator shpComp)
	{
		int n = array.length;

		// Here we build the heap by rearranging our array.
		for (int i = n / 2 - 1; i >= 0; i--)
		{
			heapify(array, n, i, shpComp);
		}

		// Here is where we'll move the largest element to the end and re-heapify our
		// array.
		for (int i = n - 1; i > 0; i--)
		{
			Swap(array, 0, i);// Here we swap the largest element with the last one.
			heapify(array, i, 0, shpComp);// Here we re-heapify the lower heap.
		}
	}

	/**
	 * This helper method will rearrange part of our array into a heap. The heap is
	 * a binary tree where the parent is always larger than it's children.
	 * 
	 * @param array   The array to be heapified.
	 * @param n       The size of the heap.
	 * @param i       The index of the current element node.
	 * @param shpComp An object to invoke the compare method.
	 */
	private static void heapify(ThreeDShape[] array, int n, int i)
	{
		int largest = i;// Here we assume the element is the largest.
		int left = 2 * i + 1;// Index of the left child.
		int right = 2 * i + 2;// Index of the right child.

		// Check if the left child is larger than the element.
		if (left < n && array[left].compareTo(array[largest]) < 0)
		{
			largest = left;
		}

		// Check if the right child is larger than the current largest.
		if (right < n && array[right].compareTo(array[largest]) < 0)
		{
			largest = right;
		}
		// If it is not the largest, we swap it with the largest and then re-heapify.
		if (largest != i)
		{
			Swap(array, i, largest);
			heapify(array, n, largest);
		}
	}

	/**
	 * This helper method will rearrange part of our array into a heap using the
	 * comparator. The heap is a binary tree where the parent is always larger than
	 * it's children.
	 * 
	 * @param array   The array to be heapified.
	 * @param n       The size of the heap.
	 * @param i       The index of the current element node.
	 * @param shpComp An object to invoke the compare method.
	 */
	private static void heapify(ThreeDShape[] array, int n, int i, ShapeComparator shpComp)
	{
		int largest = i;// Here we assume the element is the largest.
		int left = 2 * i + 1;// Index of the left child.
		int right = 2 * i + 2;// Index of the right child.

		// Check if the left child is larger than the element.
		if (left < n && shpComp.compare(array[left], array[largest]) < 0)
		{
			largest = left;
		}

		// Check if the right child is larger than the current largest.
		if (right < n && shpComp.compare(array[right], array[largest]) < 0)
		{
			largest = right;
		}
		// If it is not the largest, we swap it with the largest and then re-heapify.
		if (largest != i)
		{
			Swap(array, i, largest);
			heapify(array, n, largest, shpComp);
		}
	}
}