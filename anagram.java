// WAP to check wheather the given string is Anagram or not.

package Stringprogramming;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
	    String s1="cat";
	    String s2="act";
	    if (s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean isanagram=true;
			for (int i = 0; i < c2.length; i++) {
				if (c1[i]!=c2[i]) {
					isanagram=false;
					break;
				}
			}
			if (isanagram) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not An Anagram");
			}
		}
	    else {
	    	System.out.println("Not an Anagram");
	    }
	}
}
