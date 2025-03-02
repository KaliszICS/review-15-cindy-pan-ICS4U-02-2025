public class PracticeProblem {

	public static int goodString(String word){
		int amount = -1;
		boolean check = false;
		boolean checkAgain = false;
		int letter = word.length() - 1;
		if (word.length()>=2){
			//case one
			if (word.charAt(0)==word.charAt(letter)){
				amount = 0;
			}
			// case two (first letter)
			for (int at = 1; at<=letter; at++){
				if (word.charAt(0)==word.charAt(at)){
					amount = word.length() - (at+1);
				}
			}
			// case two (second letter)
			for (int current = 2; current<=letter; current++){
				if (word.charAt(1)==word.charAt(current)){
					amount  = (word.length() - (current+1))+1;
				}
			}
		}
		return amount;

	}


}
