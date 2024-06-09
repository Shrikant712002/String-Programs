package edu.jsp.Programming;

public class ConvertEachLetterUppercaseInString {
	public static void main(String[] args) {
		String  str = "shEeLa is beaUtiFul gIRl";
		String temp = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z'){
				temp=temp+(char)(ch-32);
			}
			else {
				temp=temp+ch;
			}
		}
		System.out.println(temp);
	}
}
