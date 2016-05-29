package com.zorolabs.stringMisc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindAllSubsetOfSet {

	public static void main(String[] args) {
		System.out.println("\n" + createSubsetUsingTree("ABCDS"));
	}

	private static String[] createSubsetUsingTree(String s) {

		List<String> result = new ArrayList<String>();
		result.add("[]");

		// If str is not null, then process further otherwise return empty set.
		if (s != null && s.length() > 0) {

			// Iterate each element of a set
			for (int i = 0; i < s.length(); i++) {

				// Working on str.charAt(i);
				// Store the result of subset of str.charAt(i) in tempList.
				List<String> tempList = new ArrayList<String>();

				// Add str.charAt(i) in each item of result.
				Iterator<String> iter = result.iterator();
				while (iter.hasNext()) {
					String val = iter.next();

					// If val is [], it means str.charAt(i) is not included, So
					// include it in result.
					if (val.equals("[]")) {
						tempList.add("[" + s.charAt(i) + "]");
					} else {

						tempList.add("[" + val.substring(1, val.length() - 1)
								+ ", " + s.charAt(i) + "]");
					}
				}

				// Add all subsets present in tempList to final result.
				result.addAll(tempList);
			}
		}

		String[] newStr = new String[result.size()];

		for (int i = 0; i < result.size(); i++) {
			newStr[i] = result.get(i);
			System.out.println(newStr[i]);

		}

		return newStr;

	}

}