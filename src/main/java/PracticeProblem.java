import java.util.HashMap;

public class PracticeProblem {

	public static int goodString(String s){
		int amount = -1;
		int length = s.length();
		HashMap <Character,Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < length; i ++){
			map.put((s.charAt(i)),i);
		}
		for (int index = 0; index < length; index++){
			if (map.get(s.charAt(index)) != index){
				amount = (s.length()-1) - map.get(s.charAt(index)) + index;
				length = 0;
			}
		}

		return amount;

	}


}
