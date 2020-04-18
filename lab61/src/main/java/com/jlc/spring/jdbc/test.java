package com.jlc.spring.jdbc;

public class test {
	public static void main(String[] args) {
		String str = "My Name   is      Yamini";
		char[] cs = str.toCharArray();
		String rs = "";
		int count = 0;
		int startindex = 0, endindex = 0;
		int temp = cs.length;
		for (int i = cs.length - 1; i >= 0; i--) {

			if (cs[i] == ' ') {
				if (count == 0)
					startindex = i + 1;
				count++;
			} else if (startindex != 0 && count != 0) {
				endindex = i + 1;
				rs = rs + str.substring(startindex, temp);
				while (count >= 0) {
					rs = rs + " ";
					count--;
				}
				count = 0;
				startindex = 0;
				temp = endindex;
			}else if(i == 0) {
				rs = rs + str.substring(i, temp);
			}

		}
		System.out.println(rs);
		/*
		 * String[] s = str.split(" "); str =""; for (int i = s.length - 1; i >= 0; i--)
		 * { if (i == 0) { str = str + s[i]; } else { str = str + s[i] + " ";
		 * System.out.println(str); } }
		 * 
		 * System.out.println(str);
		 */
	}
}
