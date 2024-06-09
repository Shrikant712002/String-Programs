package edu.jsp.Programming;

public class FrequencyOfACharacterInString {
	public static void main(String[] args) {
		String collect = "";
		String s = "entertainment".toLowerCase();
		for(int i=0;i<s.length();i++) {
			char k =s.charAt(i);
			if(collect.indexOf(k)==-1) {
				int count=0;
				for(int j=0;j<s.length();j++) {
					char ch = s.charAt(j);
					if(ch==k)
						count++;
				}
				collect = collect+k;
				System.out.println(k+" is repeated "+count+" times");
			}
		}
	}
}
