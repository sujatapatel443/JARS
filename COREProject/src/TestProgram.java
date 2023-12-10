import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TestProgram {

	public static void main(String[] args) {
		Emp1 e1=new Emp1(501,"RAJ");
		Emp1 e2=new Emp1(201,"SUJATA");
		Emp1 e3=new Emp1(301,"RAJ");
		Emp1 e4=new Emp1(101,"MUKESH");
		Emp1 e5=new Emp1(401,"RAJ");
		Emp1 e6=new Emp1(701,"ARPIT");
		Emp1 e7=new Emp1(601,"RAM");
		
		
		List<Emp1> list=new ArrayList<Emp1>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);list.add(e6);list.add(e7);
		
		System.out.println(list);
		
		list.stream().sorted(Comparator.comparing(Emp1::getEname).thenComparing(Emp1::getEid)).collect(Collectors.toList());
		
		List<Emp1> listEmp=list.stream().sorted(Comparator.comparing(Emp1::getEname).thenComparing(Emp1::getEid)).collect(Collectors.toList());
		System.out.println(listEmp);
		

	}

}

class Emp1 {
	int eid;
	String ename;
	
	Emp1(int eid,String name){
		this.eid=eid;
		this.ename=name;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		
		return "EID :"+eid+" ENAME :"+ename;
	}

	
}
class EIDComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp1 e1=(Emp1)o1;
		Emp1 e2=(Emp1)o2;
		return e1.eid-e2.eid;
	}
	
}
