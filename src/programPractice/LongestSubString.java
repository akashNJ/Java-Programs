package programPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LongestSubString {

	public static void main(String[] args) {

		String s = "acbabce";
		int right=0;
		int left =0;
		int max_length=0;
		String str="";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		while(right<s.length()) { 
			if(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			else {
				set.add(s.charAt(right));
				if(set.size()>=max_length) {
					str=set.toString(); 
				}
				max_length = Math.max(max_length,set.size());
				right++;
			}
		}
		
		System.out.println(max_length);
		System.out.println(str);
	}

}
