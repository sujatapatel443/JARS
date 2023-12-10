import java.util.HashMap;
import java.util.Map;

public final class StringOccurence {
	public static void main(String[] args) {
		String str="Hello I am doing good";
		String[] str1=str.split(" ");
		String rev="";
		for(String s:str1) {
			String temp="";
			for(char c:s.toCharArray()) {
				temp=c+temp;
				
			}
			rev=rev+temp+" ";
		}
		System.out.print(rev+" ");
		
	}
}
