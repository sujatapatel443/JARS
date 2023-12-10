
public class OccurenceOfStringWithoutMap {

	public static void main(String[] args) {
		
		String str="hello Ravi hello Pooja hello alls";
		String[] st=str.split(" ");
		
		for(int i=0;i<st.length;i++) {
			int count=0;
			for(int j=0;j<st.length;j++) {
				if(st[i].equals(st[j])) {
					count++;
				}
			}
			
			System.out.println("Occurence of String in "+st[i]+" ->"+count);
		}
			
			

	}

}
