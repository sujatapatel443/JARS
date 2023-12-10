import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorting_Student_Basis_Of_Name {

		public static void main(String[] args) {
			
			Set<Student> set=new TreeSet<Student>(new MyComparator());
			
			set.add(new Student("Sujata"));
			set.add(new Student("Raj"));
			set.add(new Student("Anusha"));
			//System.out.println(set);
			
			List<Student> list =new ArrayList<Student>();
			
			list.add(new Student("Sujata"));
			list.add(new Student("Raj"));
			list.add(new Student("Anusha"));
			System.out.println(list);
			Collections.sort(list,new MyComparator());
			//System.out.println(list);

		}
	}

	class Student implements Comparable{
		String name;

		public Student(String name) {
			
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}

		@Override
		public int compareTo(Object o) {
			Student s=(Student)o;
			return this.name.compareTo(s.name);
		}

		
		
		
		
	}

	class MyComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			
			if(o1 instanceof Student && o2 instanceof Student) {
				Student s1=(Student)o1;
				
				Student s2=(Student)o2;
				return s1.name.compareTo(s2.name);
			}
			return 0;
		}
		
	}



