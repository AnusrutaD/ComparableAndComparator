package comparableAndComparator.examples;

import java.util.TreeSet;

import comparableAndComparator.comparators.ReverseComparator;

public class Sorting4 {

	public static void main(String[] args) {
		//TreeSet is a set which is by default sorted in order
		// Here we are going to reset the TreeSet in reverse order
		TreeSet<Integer> ts = new TreeSet<Integer>(new ReverseComparator());
		ts.add(45);
		ts.add(62);
		ts.add(94);
		ts.add(28);
		ts.add(69);
		System.out.println(ts);
	}

}
