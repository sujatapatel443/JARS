import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		
		String str="Good Morning";
		
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			
			if(c!=32)
			if(map.containsKey(c)) {
				Integer i=map.get(c);
				i++;
				map.put(c, i);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		
	}

}
