import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(678, "Raj Chettiar", 31, "Male", "Product Development", 2012, 87700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		Map<String , Long> m1=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(m1);
		employeeList.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);
		
		Map<String , Double> m2=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, 
				Collectors.averagingDouble(Employee::getAge)));
		System.out.println(m2);
		
		Optional<Employee> maxSal=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(maxSal.get());
		int leastIndex=-1;
		int arr[]= {10,5,0,1,0,0,15};
		int ar1[]=new int[arr.length];
		int coutZero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				coutZero++;
			}
		}
		
		for(int i=0;i<coutZero;i++) {
			ar1[i]=0;
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=0) {
				ar1[coutZero]=arr[j];
				coutZero++;
			}
		}
		for(int k:ar1) {
			System.out.print(k+" ,");
		}
		
		
		/*for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==1) {
				if(arr[i+1]==1) {
					leastIndex=i;
				}
			}
			
			if(arr[i]==1) {
				if(arr[i+1]==0) {
					arr[leastIndex]=arr[i+1];
					leastIndex=i;
				}
			}
			
		}
*/		
		

	}

}
