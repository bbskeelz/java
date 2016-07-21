package skiena;

public abstract class BackTrackingGeneric {
	
	public abstract boolean isSolution(int k);
	
	public abstract void processSolution();
	
	public abstract void backtrack(int i, boolean[] a);

	public abstract void construct_candidates();
	
	public abstract void make_move();
	
	public abstract void unmake_move();
	
}
