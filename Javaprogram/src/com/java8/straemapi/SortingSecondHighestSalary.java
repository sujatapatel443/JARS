package com.java8.straemapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SortingSecondHighestSalary {

	public static void main(String[] args) {
		
		List<Employee> empList =new ArrayList();
		empList.add(new Employee(11,"Sujata",9936323375l,"Bangalore",20000));
		empList.add(new Employee(12,"Raj",9452635578l,"Bangalore",25000));
		empList.add(new Employee(13,"Anusha",9452735878l,"Delhi",30000));
		empList.add(new Employee(14,"Sreya",9452675878l,"Chennai",45000));
		empList.add(new Employee(15,"Ravi",9452685878l,"Noida",30000));
		empList.add(new Employee(16,"Sunita",9452835878l,"Varanasi",23000));
		empList.add(new Employee(17,"Sujit",9452635878l,"Pune",34000));
		
		//find second highest salary of the employee
		
		Optional<Employee> secondHihgestSalariedemp=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(secondHihgestSalariedemp.get());
		
		Optional<Employee> secondHihgestSalariedempSElf=empList.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).skip(1).findFirst();
		System.out.println(secondHihgestSalariedempSElf.get());
		
		Optional<Employee> secondHihgestSalariedemp1=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst();
		System.out.println(secondHihgestSalariedemp1.get());
		
		Optional<Employee> thirdLowestSalariedEmp=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(2).findFirst();
		System.out.println(thirdLowestSalariedEmp.get());
		
		System.out.println("*************************");
		
		
		Optional<Employee> secondHighestSalary=empList.stream().sorted((a,b)->(int)(b.getSalary()-a.getSalary())).skip(1).findFirst();
		
		System.out.println(secondHighestSalary.get());

		
		int arr[]= {23,10,98,5,7,45};
		
		for(int i=0;i<arr.length-1; i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				int temp;
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
		for(int i :arr) {
			System.out.print(i +" ");
		}
		
		empList.stream().filter(e->e.getSalary()>30000).forEach(System.out::println);

	}

}