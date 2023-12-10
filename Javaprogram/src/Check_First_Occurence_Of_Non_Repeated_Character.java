import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Check_First_Occurence_Of_Non_Repeated_Character {

	public static void main(String[] args) {
		
		String s="epamexcellenceprograming";
		
		char[] ch=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				int i=map.get(c);
				i++;
				map.put(c, i);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.print(map+" ");
		System.out.println();
		Set set=map.entrySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry=(Map.Entry)it.next();
			if(entry.getValue()==(Integer)1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
				
				break;
			}
		}
		

	}

}
