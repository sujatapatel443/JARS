import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		
		String str="Sujata Patel is writing";
		
		char ch[]=str.toCharArray();
		
		Map<Character, Integer> m=new HashMap<>();
		for(char c :ch) {
			
			if(c!= 32) {
				
				if(m.containsKey(c)){
					Integer count=m.get(c);
					count++;
					m.put(c, count);
				}else {
					m.put(c, 1);
				}
			}
			
		} 
		System.out.println(m);
		
	}}