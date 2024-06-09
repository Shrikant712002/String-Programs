package edu.jsp.Programming;

public class LargestWordInString {
	public static void main(String[] args) {
		String str ="she is my girlfriend who is sitting there";
		String largest = "";
		int max = 0;
		String arr[] = str.split(" ");
		for(String a:arr) {
			if(a.length()>max) {
				max=a.length();
				largest = a;
			}
		}
		System.out.println(largest);
	}
}
