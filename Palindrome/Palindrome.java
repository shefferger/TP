public class Palindrome{
	public static void main(String[] args){
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals(reverseString(args[i]))){
				System.out.println("'" + args[i] + "' is a palindrome!");
			}
			else{
				System.out.println("'" + args[i] + "' is not a palindrome!");
			}
		}
	}
	
	public static String reverseString(String s){
		String ret = "";
		for (int i = s.length(); i > 0; i--){
			ret += s.charAt(i - 1);
		}
		return ret;
	}
}