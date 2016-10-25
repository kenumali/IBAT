public class BracketExercise {
	public static void main(String[] args) {
		System.out.println(is_Bracket('{'));
		System.out.println(is_Bracket('!'));
		System.out.println(countBrackets("abas(#dw}ler{"));
	}
	
	public static boolean is_Bracket(char c) {
		boolean isBracket = false;
		String brackets = "(){}[]";
		for(int i = 0; i < brackets.length(); i++) {
			if(brackets.charAt(i) == c) {
				isBracket = true;
			}
		}
		return isBracket;
	}
	
	public static int countBrackets(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(is_Bracket(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
