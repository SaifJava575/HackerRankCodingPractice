package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_08_TimeConversionTest {

	public static String timeConversion(String s) {
		char arr[]=s.toCharArray();
		int n=arr.length;
		String res="";
		String key="";
		String e="";
		for(int i=n-1;i>=n-2;i--)
			key+=arr[i];
		
		if(key.equalsIgnoreCase("MA"))
			res= s;
		else if(key.equalsIgnoreCase("MP")) {
			String a=s.substring(0, n-2);
			char[] ch=a.toCharArray();
			String c="";
			for(int i=0;i<a.length();i++) {
				if(ch[i]==':')
					continue;
				else
					c+=ch[i];
			}
			int a1=Integer.parseInt(c);
			String b="120000";
			int b1=Integer.parseInt(b);
			int result=a1+b1;
			
			res=String.valueOf(result);
			char[] d=res.toCharArray();
			List<Character> list=new ArrayList<>();
			for(int i=0;i<d.length;i++) {
				list.add(d[i]);
			}
			list.add(2, ':');
			list.add(5, ':');
			 for(Character ele:list)
				 e+=ele;
		}
		return e;			
	}
	
	public static String convertToMilitaryTime(String time12Hour) {
        String[] timeParts = time12Hour.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1].substring(0, 2));
        int second = Integer.parseInt(timeParts[2].substring(0, 2));
        String meridiem = timeParts[2].substring(2);

        if (meridiem.equalsIgnoreCase("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else if (meridiem.equalsIgnoreCase("PM")) {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

	public static void main(String[] args) {
		String time ="07:05:45PM";
		String response=timeConversion(time);
		System.out.println("Output should be 24 hours format "+response);
		
		String result=convertToMilitaryTime(time);
		System.out.println("The output is "+result);
	}

}
