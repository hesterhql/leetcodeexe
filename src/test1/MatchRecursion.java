package test1;

public class MatchRecursion {

	public static boolean isMatch(String text, String pattern) {
	        if(pattern.isEmpty())
	            return text.isEmpty();
	        //first character was match or not 
	        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
	        
	        if(pattern.length() >= 2 && pattern.charAt(1) == '*'){
	            return (isMatch(text,pattern.substring(2)) || 
	                   (first_match && isMatch(text.substring(1),pattern)));
	        }else{
	            return first_match && isMatch(text.substring(1),pattern.substring(1));
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("mississippi", "mis*is*ip*."));
	}

}
