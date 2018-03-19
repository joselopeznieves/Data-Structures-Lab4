package sortersTesterClasses;

import sorterClasses.SelectionSortSorter;

public class IncreasingAndDecreasingTester {
	
	private static Integer[] arr = {5, 9, 20, 22, 20, 5, 4, 
			13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
	
	public static void main(String[] args){
		
		SelectionSortSorter<Integer> sorter = new SelectionSortSorter<>();
		
		System.out.println("Unsorted Array: " );
		showArray(arr);
		
		sorter.sort(arr, new IntegerComparator1());
		System.out.println("Increasing Order Array: ");
		showArray(arr);
		
		sorter.sort(arr, new IntegerComparator2());
		System.out.println("Decreasing Order Array: ");
		showArray(arr);
		
	}
	
	private static void showArray(Integer[] a) { 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
} 
