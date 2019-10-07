package test1;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
	
	
	 public static List<String> letterCombinations(String digits) {
         String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         List<String> result = new ArrayList<String>();
 
         if (digits.length()==0) return result;
         
         result.add("");
         for (int i=0; i<digits.length(); i++) 
             result = combine(digitletter[digits.charAt(i)-'0'],result);// '2'-'0'=2
         
         return result;
     }
     
     public static List<String> combine(String digit, List<String> l) {
         List<String> result_1 = new ArrayList<String>();
         
         for (int i=0; i<digit.length(); i++) 
        	 
             for (String x : l)  // l= {a,b,c} digit
            	{ //
            	// System.out.println(digit.charAt(i));//d e f
                 result_1.add(x+digit.charAt(i));
     }
         return result_1;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombinations("23");
		System.out.println(letterCombinations("23"));
		
	}

}
