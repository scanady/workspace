package org.validator;

import org.validator.VulgarityFilter.LANG;

public class FilterTester {

	public static void main(String[] args) {
		WordFilter filter = new VulgarityFilter(LANG.EN);

		String[] words = { "bad ass", "a$$", "a$$hole", "ok", "k", "you", "yo|_|", "text", "txt", "dude", "d00d", "this is the thing",
				"th15 is teh th1ng", "secret", "s3cr3t" };
		for (String word : words) {
			FilterResult result = filter.filter(word);
			System.out.print(word + ": ");
			System.out.println(result.getVulgarity());
			//System.out.println(result.getMask());
		}

	}

}
