package sorterClasses;

public class CombSortSorter<E> extends AbstractSorter<E> {

	public CombSortSorter() {
		super("Comb Sort");
	}

	// The complexity is O(n^2)
	@Override
	protected void auxSort() {
		
		int gap = arr.length;
		
		boolean swapper = true;
		
		while( swapper || gap != 1) {
			gap = getGap(gap);
			swapper = false;
			for(int i = 0; i < arr.length - gap; i++) {
				if(cmp.compare(arr[i], arr[i + gap]) > 0) {
					this.swapArrayElements(i, i+gap);
					swapper = true;
				}
			}
		}
		
		
	}
	
	private int getGap(int gap) {
		gap = (int) (gap / 1.3);
		
		if(gap < 1) return 1;
		return gap;
	}
}
