import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Get_Three_Highest_Salary_from_List {
	
public static void main(String[] args) {
		
		ArrayList<Employee1> empList=new ArrayList<Employee1>();
		empList.add(new Employee1(101,"RAJ",7000,67));
		empList.add(new Employee1(102,"SUJATA",8000,62));
		empList.add(new Employee1(103,"TAJ",9000,56));
		empList.add(new Employee1(104,"RAJA",5000,62));
		empList.add(new Employee1(105,"JAR",12000,23));
		empList.add(new Employee1(106,"AAJ",1000,69));
		
		List<Employee1> sortedList =	empList.stream().sorted((e1,e2)->(int)(e2.salary-e1.salary)).filter(e->e.age>60).collect(Collectors.toList());
		System.out.println(sortedList);
		
		int count =0;
		for(Employee1 e:sortedList) {
			count++;
			if(count>3)break;
			System.out.println(e);
			
		}
		System.out.println(sortedList.get(0)+"\t"+sortedList.get(1)+"\t"+sortedList.get(2));
	
		Optional<Employee1> e1=sortedList.stream().findFirst();
		System.out.println(e1.get());
		
		Optional<Employee1> e2=sortedList.stream().skip(1).findFirst();
		System.out.println(e2.get());
		
		Optional<Employee1> e3=sortedList.stream().skip(2).findFirst();
		System.out.println(e3.get());
		
}
}  

class Employee1 implements Comparable{
	
	int id;
	String name;
	int salary;
	int age;
	public Employee1(int id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		
		Employee e=(Employee)o;
		return (int) (this.salary-e.salary);
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+salary+" "+age;
	}
	

}
