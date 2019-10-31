package sets;

import java.util.*;

public class MergeSet {
	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b){
		Set<T> mergedSet = new TreeSet<T>();
		
		mergedSet.addAll(a);
		mergedSet.addAll(b);
		
		return mergedSet;
	}
	
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,5,7,9}));
		boolean ret = a.add(-1);
		//boolean ret = a.add(MAX_VALUE));
		System.out.println("a.add(-1) returns: " + ret);
		Set<Integer> b = new TreeSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {0,2,4,5,6,8}));
		
		System.out.println("Set a: " + a);
		System.out.println("Set b: " + b);
		Set<Integer> c = new TreeSet<Integer>();
		c = mergeSet(a,b);
		System.out.println("Merged Set: " + mergeSet(a,b));
		c.addAll(Arrays.asList(new Integer[] {20,30}));
		System.out.println("Merged Set: " + c);
	}
}
