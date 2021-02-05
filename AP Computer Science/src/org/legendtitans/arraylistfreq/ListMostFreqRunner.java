package org.legendtitans.arraylistfreq;

import java.util.ArrayList;

public class ListMostFreqRunner {
	public static void main(String args[]) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(12);
		l1.add(12);
		l1.add(12);
		l1.add(12);
		l1.add(34);
		l1.add(34);
		l1.add(34);
		l1.add(34);
		l1.add(23);
		ListMostFreq.go(l1);
		
	}

}
