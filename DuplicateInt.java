package cloverProject.Imp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInt {
	public static void main(String[] args) {
		//find duplicate element in integer list in java 8 	
		
//		List<Integer> numbers=Arrays.asList(4,6,6,0,10,12,14,2,4,6);
//		Set<Integer> set =new HashSet<>();
//		System.out.println(numbers.stream().filter(n->!set.add(n)).collect(Collections.toset())));
//		
		
           List<Integer> numbers = Arrays.asList(2, 4, 5, 3, 7, 2, 4, 7, 8, 9, 3);
			Set<Integer> set = new HashSet<>(); 
			//System.out.println(numbers.stream().filter(n -> !set.add(n)).collect(Collectors.toSet()));
			   numbers.stream().filter (n->!set.add(n)).forEach(n->System.out.println(n));
			
	
		
	}

}
