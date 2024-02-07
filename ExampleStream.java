package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExampleStream {
	public static void main(String[] args) {
//		List<Student> list = new  ArrayList<>();
		
		for(Student s :getAllStudent()) {
			if(s.getId()>=14)
			System.out.println(s);
			
		}
		
		System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
		
		List<Student> collect = getAllStudent().stream().filter(p -> p.getId()>=13).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		
		getAllStudent().stream().filter(p -> p.isVoter()==true).forEach(System.out::println);
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		List<String> collect2 = getAllStudent().stream().map(m -> m.getName()).sorted().collect(Collectors.toList());
		System.out.println(collect2);
		
		getAllStudent().stream().map(m -> m.getSalary()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	
	}
	
	public static List<Student> getAllStudent(){
		List<Student> list = new ArrayList<>();
		list.add(new Student(11, "Brahmdev", "Narhar pvt sch", false,1000));
		list.add(new Student(12, "cha", "Mar", true,187));
		list.add(new Student(13, "Deep", "Kny", false,10));
		list.add(new Student(14, "Kul", "Gyan pvt sch", true,65));
		list.add(new Student(15, "Amit", "Public pvt sch", true,25343));
		list.add(new Student(16, "Rajmdev", "Liuy pvt sch", false,6553));
		list.add(new Student(17, "Brahvas", "Kuytr pvt sch", true,8773));
				
		return list;
		
	
	}

}

