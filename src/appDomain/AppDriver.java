package appDomain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import shapes.*;
import utilities.SortingAlgorithms;

/**
 * The AppDriver class is the entry point for the application that reads 3D shapes from a file,
 * sorts them based on specified criteria, and prints the sorted shapes along with the time taken
 * for sorting.
 * <p>
 * Command line arguments:
 * -f: Specifies the file name containing the shapes.
 * -t: Specifies the type of comparison (e.g., height, volume).
 * -s: Specifies the type of sorting algorithm to use (e.g., bubble sort, insertion sort).
 * <p>
 * Usage: java -jar Sort.jar -ffile_name -tv -sb
 */
public class AppDriver {

	/**
	 * The main method that serves as the entry point for the application.
	 *
	 * @param args Command line arguments specifying the file name, comparison type, and sort type.
	 */
	public static void main(String[] args) {
		String fileName = null;
		String compareType = null;
		String sortType = null;

		// Parse command line arguments
		for (String arg : args) {
			if (arg.startsWith("-f")) {
				fileName = arg.substring(2);
			} else if (arg.startsWith("-t")) {
				compareType = arg.substring(2);
			} else if (arg.startsWith("-s")) {
				sortType = arg.substring(2);
			}
		}

		if (fileName == null || compareType == null || sortType == null) {
			System.out.println("Usage: java -jar Sort.jar -ffile_name -tv -sb");
			return;
		}

		// Read shapes from file
		List<ThreeDShape> shapes = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			int numberOfShapes = Integer.parseInt(br.readLine().trim());
			for (int i = 0; i < numberOfShapes; i++) {
				String[] parts = br.readLine().split(" ");
				String shapeType = parts[0];
				double height = Double.parseDouble(parts[1]);
				double edgeLengthOrRadius = Double.parseDouble(parts[2]);

				switch (shapeType) {
					case "Cylinder":
						shapes.add(new Cylinder(height, edgeLengthOrRadius));
						break;
					case "Cone":
						shapes.add(new Cone(height, edgeLengthOrRadius));
						break;
					case "Pyramid":
						shapes.add(new Pyramid(height, edgeLengthOrRadius));
						break;
					case "SquarePrism":
						shapes.add(new SquarePrism(height, edgeLengthOrRadius));
						break;
					case "TriangularPrism":
						shapes.add(new TriangularPrism(height, edgeLengthOrRadius));
						break;
					case "PentagonalPrism":
						shapes.add(new PentagonalPrism(height, edgeLengthOrRadius));
						break;
					case "OctagonalPrism":
						shapes.add(new OctagonalPrism(height, edgeLengthOrRadius));
						break;
					default:
						System.out.println("Unknown shape type: " + shapeType);
						return;
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}

		// Convert list to array
		ThreeDShape[] shapeArray = shapes.toArray(new ThreeDShape[0]);

		// Create ShapeComparator if needed
		ShapeComparator comparator = null;
		if (!compareType.equalsIgnoreCase("h")) {
			comparator = new ShapeComparator(compareType);
		}

		// Sort shapes
		long startTime = System.currentTimeMillis();
		switch (sortType.toLowerCase()) {
			case "b":
				if (comparator != null) {
					SortingAlgorithms.BubbleSort(shapeArray, comparator);
				} else {
					SortingAlgorithms.BubbleSort(shapeArray);
				}
				break;
			case "i":
				if (comparator != null) {
					SortingAlgorithms.InsertSort(shapeArray, comparator);
				} else {
					SortingAlgorithms.InsertSort(shapeArray);
				}
				break;
			case "s":
				if (comparator != null) {
					SortingAlgorithms.SelectionSort(shapeArray, comparator);
				} else {
					SortingAlgorithms.SelectionSort(shapeArray);
				}
				break;
			case "m":
				if (comparator != null) {
					SortingAlgorithms.MergeSort(shapeArray, comparator);
				} else {
					SortingAlgorithms.MergeSort(shapeArray);
				}
				break;
			case "q":
				if (comparator != null) {
					SortingAlgorithms.QuickSort(shapeArray, 0, shapeArray.length - 1, comparator);
				} else {
					SortingAlgorithms.QuickSort(shapeArray, 0, shapeArray.length - 1);
				}
				break;
			case "h":
				if (comparator != null) {
					SortingAlgorithms.HeapSort(shapeArray, comparator);
				} else {
					SortingAlgorithms.HeapSort(shapeArray);
				}
				break;
			default:
				System.out.println("Invalid sort type");
				return;
		}
		long endTime = System.currentTimeMillis();

		// Print sorted shapes and timing
		System.out.println("Shapes sorted by " + compareType + " using " + sortType + " sort:");
		for (int i = 0; i < shapeArray.length; i++) {
			if (i == 0 || i == shapeArray.length - 1 || i % 1000 == 0) {
				System.out.println("Shape " + i + ": Height = " + shapeArray[i].getHeight() + ", Volume = " + shapeArray[i].getVolume());
			}
		}
		System.out.println("Sorting took " + (endTime - startTime) + " milliseconds.");
	}
}
