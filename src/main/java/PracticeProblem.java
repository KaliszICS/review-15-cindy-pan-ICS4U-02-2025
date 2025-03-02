public class PracticeProblem {

	public static int goodString(String word){
		int amount = -1;
		boolean check = false;
		boolean checkAgain = false;
		String letter[] = word.split("");
		if (word.length()>=2){
			if (letter[0]==letter[letter.length-1]){ // case where the string is already a good string
				amount  = 0;
			}
			for (int find = 1; find<letter.length; find++){ //checks if the same character exists
				if (letter[0] == letter[find]){
					check = true;
					
				}
				if (letter[1]==letter[find+1]){
					checkAgain = true;
				}
				
				if (check = true){
					
				}

			}
		}
		return amount;

	}


}
