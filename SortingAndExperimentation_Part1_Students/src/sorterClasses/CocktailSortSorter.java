package sorterClasses;

public class CocktailSortSorter<E> extends AbstractSorter<E> {
	
	public CocktailSortSorter() {
		super("Cocktail Sort");
	}
	
	//Worst case complexity is O(n^2) 

	@Override
	protected void auxSort() {
		boolean swapper = true;
		int start = 0; 
		int end = arr.length;
		
		while(true) {
			
			swapper = false;
			
			for(int i = start; i < end - 1; i++) {
				if(cmp.compare(arr[i], arr[i+1]) > 0) {
					this.swapArrayElements(i, i+1);
					swapper = true;
				}
			}
			if(!swapper) break;
			
			end = end - 1; 
			
			for(int i = end - 1; i >= start; i--) {
				if(cmp.compare(arr[i], arr[i+1]) > 0) {
					this.swapArrayElements(i, i+1);
					swapper = true;
				}
			}
			
			start += 1;
		}
		
	}

}
