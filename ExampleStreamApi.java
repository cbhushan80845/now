package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class stream{
	public static <K, V>  Stream<Map.Entry<K, V>> convertMapToStram(Map<K, V> map) {
		return map.entrySet().stream();
		
	}
}
public class ExampleStreamApi {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<>();
		Student student = new Student(1, "Sunny", "Marwadi", false,1000);
		Student student1 = new Student(2, "Chandra", "Marwadi", true,20000);
		Student student2 = new Student(3, "Ravi", "Marwadi", true,3000);
		Student student3 = new Student(4, "Amit", "Marwadi", true,4434);
		Student student4 = new Student(5, "Deepak", "Kdefs", true,8745);
		Student student5 = new Student(6, "Manash", "s t ", false,100);

		s.add(student);
		s.add(student1);
		s.add(student2);
		s.add(student3);
		s.add(student4);
		s.add(student5);
		
		List<Integer> marks = Arrays.asList(11,22,33);
		//Map<K, V> m = new  HashMap<>()
		//System.out.println(s);
		List<Student> collect = s.stream().filter(p -> p.getName().startsWith("Ch")).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = s.stream().filter(s1 -> s1.isVoter()|| s1.getName().startsWith("Ch")).map(m -> m.getId()+1).collect(Collectors.toList());
		System.out.println(collect2);
		
		Integer orElse = marks.stream().reduce((first,fifth)-> fifth).orElse(null);
		System.out.println(orElse);
		
	
		

	}

}
