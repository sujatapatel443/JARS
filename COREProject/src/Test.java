import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
     List<Emp> list=new ArrayList<Emp>();
     
     
     Emp e=new Emp(101,"RAJ","COMP", 500000);
     Emp e1=new Emp(101,"RAJ","ABC", 500000);
     Emp e2=new Emp(101,"RAJ","COMP", 100000);
     Emp e3=new Emp(101,"RAJ","XYZ", 500000);
     Emp e4=new Emp(101,"RAJ","COMP", 200000);
     
     list.add(e); list.add(e1);list.add(e2);list.add(e3);list.add(e4);
     
     Map<String,Double> m=list.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.summingDouble(Emp::getSallary)));
     System.out.println(m);
     
     String str="20AABBCAA";
     String s="";
     char ch[]=str.toCharArray();
     for(char c:ch) {
    	 
    	 try {
    		 
    		int k=Integer.parseInt(c+"");
    	 }catch(Exception ex) {
    		s=s+c; 
    	 }
    	 
     }
     System.out.println(s);
     System.out.println("hello :"+5);
     
	}

}
