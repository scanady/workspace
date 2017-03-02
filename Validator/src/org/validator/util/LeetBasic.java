package org.validator.util;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

public class LeetBasic {

	static H<String, String> c;
	static H<String, String> w;
	static {
		c = new H<String, String>();
		c.p("1", "i");
		c.p("!", "i");
		c.p("$", "s");
		c.p("5", "s");
		c.p("@", "a");
		c.p("4", "a");
		c.p("3", "e");
		c.p("7", "t");
		c.p("+", "t");
		c.p("#", "h");
		c.p("'d", "ed");
		c.p("0", "o");
		c.p("zero", "o");
		c.p("\\/\\/", "w");
		c.p("/\\", "a");
		c.p("\\/", "v");
		c.p("|<", "k");
		c.p("[)", "d");
		c.p("8", "b");
		c.p("|_|", "u");
		c.p("|-|", "h");
		c.p("Я", "r");
		c.p("(", "c");
		c.p("VV", "w");
		c.p("&", "and");
		c.p("2", "to");
		
		w = new H<String, String>();
		w.p("@", "a");
		w.p("teh", "the");
		w.p("pwnd", "pwned");
		w.p("pwnt", "pwned");
		w.p("k", "ok");
		w.p("kk", "ok");
		w.p("y", "why");
		w.p("Y", "why");
		w.p("4", "for");
		w.p("txt", "text");
		w.p("dafuq", "what the f**k");
		w.p("d00d", "dude");
		w.p("n00b", "newbie");
		w.p("j00", "you");
		w.p("joo", "you");
	}

	public String toLeet(String line) {
		
		String[] words = StringUtils.split(line);
		for (int i = 0; i < words.length; i++) {
			//replace full words
			if (w.containsValue(words[i])) {
				words[i] = StringUtils.replace(words[i], words[i], getKeyFromValue(w, words[i]));
			} 
			
			if (!w.containsKey(words[i])){
				//replace letters
				String r = words[i];
				
				//TODO loop by string length vs. leet entries
				for (String y : c.values()) {
					if (r.contains(y)) {
						r = r.replace(y, getKeyFromValue(c, y));
					}
				}
				words[i] = r;
			}
		}
		
		return StringUtils.join(words, ' ');
	}
	
	public String fromLeet(String line) {
		String[] words = StringUtils.split(line);
		for (int i = 0; i < words.length; i++) {
			//replace full words
			if (w.containsKey(words[i])) {
				words[i] = StringUtils.replace(words[i], words[i], w.get(words[i]));
			}
			
			if (!w.containsKey(words[i])){
				//replace letters
				String r = words[i];
				
				//TODO loop by string length vs. leet entries
				for (String y : c.keySet()) {
					if (r.contains(y)) {
						r = r.replace(y, c.get(y));
					}
				}
				words[i] = r;
			}
		}
		
		return StringUtils.join(words, ' ');		
	}

	public boolean isLeet(String o) {
		boolean result = false;
		
		//replaced words
		if (w.containsKey(o))
			result = true;
		
		//replaced letters
		else {
			for (String y : c.keySet()) {
				if (o.contains(y))
					result = true;
			}
		}
		return result;
	}

	
	public static void main(String[] args) {
		String[] words = {"ok", "k", "you", "yo|_|", "text", "txt", "dude", "d00d", "this is the thing", "th15 is teh th1ng", "secret", "s3cr3t"};
		for (String word : words) {
			System.out.println(word + " : " + new LeetBasic().isLeet(word));
			//System.out.println(word + " : " + new LeetBasic().fromLeet(word));
		}
		
		
	}

	static String getKeyFromValue(Map<String,String> col, String value) {   
		String key= null;
	    for(Map.Entry entry: col.entrySet()){
	        if(value.equals(entry.getValue())){
	            key = (String) entry.getKey();
	            break; //breaking because its one to one map
	        }
	    }
	    return key;
	}
	
}

@SuppressWarnings("serial")
class H<T1, T2> extends LinkedHashMap<T1, T2> {

	T2 p(T1 k, T2 v) {
		return super.put(k, v);
	}
}
