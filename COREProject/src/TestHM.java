import java.util.*;
import java.util.stream.Collectors;

public class TestHM {

	public static void main(String[] args) {
		List<EMP> ll=new ArrayList<EMP>();
		
		ll.add(new EMP(101,"RAJ",30));ll.add(new EMP(201,"TAJ",32));ll.add(new EMP(401,"VINODHA",25));
		ll.add(new EMP(501,"AMIT",35));ll.add(new EMP(101,"RAJ",28));
		
		List<EMP> l1=ll.stream().filter(e->e.getName().charAt(0)=='R').collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println(ll.stream().sorted(Comparator.comparing(EMP::getName).thenComparing(EMP::getAge)).collect(Collectors.toList()));
		
		List<EMP> l2=ll.stream().sorted(Comparator.comparing(EMP::getName).reversed().thenComparing(EMP::getAge)).collect(Collectors.toList());
		System.out.println(l2);

	}

}

class EMP{
	
	int eid;
	String name;
	int age;
	
	EMP(int eid, String name, int age){
		this.eid=eid;
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "EMP [eid=" + eid + ", name=" + name + ", age=" + age + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
