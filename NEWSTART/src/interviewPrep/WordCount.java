package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String str="chandra";
		Map<Character, Integer> map= new HashMap<>();
		for(Character ch:str.toCharArray()) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				Integer count = map.get(ch);
				map.put(ch,count+1 );
				
			}
		}
		
		System.out.println(map);
	}

}
