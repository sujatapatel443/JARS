
public class CharacterOccurenceWithoutMap {

	public static void main(String[] args) {
		
		String str="helloexcellenceprograming";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			
			System.out.println("Occurence of each characters are "+ch[i]+"->"+count);
		}

	}

}
