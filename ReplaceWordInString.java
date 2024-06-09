package edu.jsp.Programming;
public class ReplaceWordInString {
	public static void main(String[] args) {
		String str = "there is a helicopter";
		String oldWord = "helicopter";
		String newWord = "Aeroplane";
		String temp = "";
		String arr[]=str.split(" ");
		for(String s:arr) {
			if(s.equals(oldWord)) {
				temp = temp+newWord+" ";
			}
			else {
				temp = temp+s+" ";
			}
		}
		System.out.println(temp);
	}
}
