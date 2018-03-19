package sortersTesterClasses;

import java.util.Random;

import sorterClasses.InsertionSortSorter;

public class Entero {
	private int value;
	
	public Entero(int v){
		this.value = v;	
	}
	
	public int getValue(){
		return value;
	}
	
	public String toString(){
		return value + "";
	}
	
	public static void main(String[] args){
		
		Entero[] testArray = randomValues(11);
		InsertionSortSorter<Entero> sorter = new InsertionSortSorter<>();
		sorter.sort(testArray, null);
		
	}
	
	private static Entero[] randomValues(int i) {
		
		Random rnd = new Random();
		Entero[] a = new Entero[i]; 
		int num;
		for (int j=0; j<i; j++) {
			num = rnd.nextInt(100);
			a[j] = new Entero(num);
		}
			 
		
		return a;
	}
}
