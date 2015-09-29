import java.util.*;

public class TryCatchGame {

	
	public static void main(String[] args) {
		ArrayList<Character> Alpha = new ArrayList<Character>();
		ArrayList<Character> Vow = new ArrayList<Character>();
		
		for (int i = 0; i < 5; i++) {
			Alpha.add((char)('A'+i));
		}
		
		Vow.add('A');
		Vow.add('E');
		Vow.add('I');
		Vow.add('O');
		Vow.add('U');
		
		char[] chars = new char[18];
		
		for (int i = 0; i < 9; i++) {
			chars[i * 2] = (char) ('A' + i);
			chars[i * 2 + 1] = (char) ('1' + i);
		}
		
		String AlphaNum = new String(chars);
		System.out.println(AlphaNum);
		
		try {
			for (Character c : Alpha) {
				for (Character cc : Vow) {
					if (c == cc) {
						throw new CommonFoundException(Character.toString(c));
					}
				}
			}
		} catch (CommonFoundException e) {
			System.out.print("Common found.");
			System.out.println(" " + e.getMessage());
		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < AlphaNum.length(); i += 2) {
			map.put(AlphaNum.substring(i, i+1),
					Integer.parseInt(AlphaNum.substring(i+1, i+2)));
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < AlphaNum.length(); i += 2) {
			list.add(AlphaNum.substring(i, i + 1));
		}
		
		System.out.println();
		for (String s : list) {
			System.out.println(s);
		}

	}

}


class CommonFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommonFoundException(String s) {
		super(s);
	}
}
