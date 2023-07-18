package com.nt.code;

public class ReverseWordString {

	public static String decryptMessage(String s) {
		String[] str = s.split(" ");
		String res = "";
		for (int i = str.length - 1; i >= 0; i--) {
			String word=str[i];
			char[] ch=word.toCharArray();
			for(int j=1;j<ch.length;j++) {
				int a=0;
				if(ch[j]=='2'||ch[j]=='3'|| ch[j]=='4' || ch[j]=='5' || ch[j]=='6' || ch[j]=='7' || ch[j]=='8' || ch[j]=='9') {
					 a=Character.getNumericValue(ch[j]);
					 
				}
				
			}
			res += str[i] + " ";
		}
		return res;
	}

	public static void main(String[] args) {
    String str="World Hel2O";
    String msg=decryptMessage(str);
    System.out.println(msg);
	}

}
