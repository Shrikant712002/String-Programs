package edu.jsp.Programming;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String s = "entertainment";
		String collect = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(collect.indexOf(ch)==-1) {
				collect = collect+ch;
			}
		}
		System.out.println(collect);
	}
}
