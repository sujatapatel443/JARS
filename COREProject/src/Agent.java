import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Agent {
	String name;
	List<Long> phones;
	double sal;
	String city;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(sal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
			return false;
		return true;
	}

	public Agent(String name1, List<Long> phones1, double sal1, String city1) {
		super();
		name = name1;
		phones = phones1;
		sal = sal1;
		city = city1;
	}

	
	{
		System.out.println("Instance");
	}
	static{
		System.out.println("Static");
	}
	
	

	@Override
	public String toString() {
		return "Agent [name=" + name + ", phones=" + phones + ", sal=" + sal + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		
		System.out.println("Hello word");
		List<Long> phone1=new ArrayList<Long>();
		phone1.add(9876543L);
		List<Long> phone2=new ArrayList<Long>();
		phone2.add(54356778L);
		Agent a1=new Agent("RAJ",phone1,5000,"BGLR");
		System.out.println(a1);
		
		Agent a2=new Agent("NAVEEN",phone2,10000,"PUNE");
		
		
		TreeSet set=new TreeSet();
		set.add(a1);set.add(a2);
		System.out.println(set);
		
		Collection c1=set.stream().filter(e->e.city.equals("BGLR")).toList();
		
		Collection c2=set.stream().filter(e->e.city.equals("PUNE")).toList();

	}

}
