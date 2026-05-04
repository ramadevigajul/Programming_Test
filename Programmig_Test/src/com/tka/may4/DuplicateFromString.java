package com.tka.may4;

public class DuplicateFromString {

	public static void main(String[] args) {
		String str = "madam";
		int[] freq = new int[256]; 
        int count = 0;

        for (char ch : str.toCharArray()) {
            freq[ch]++;

            if (freq[ch] == 2) { 
                count++;
                if (count == 2) {
                    System.out.println("2nd duplicate character: " + ch);
                    break;
                }
            }
        }

	}

}
