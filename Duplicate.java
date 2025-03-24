package cloverProject.Imp;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
	
		//Remove Duplicates from a List
	public static void main(String[] args) {
	//Arrays.asList(2,4,5,3,7,9,,2,4,7).stream().
	
		//System.out.println(new HashSet<>(Arrays.asList(2, 4, 5, 3, 7,  2, 4, 7)));
		
		System.out.println(Arrays.asList(1,2,3,4,5,6,7,6,5,4,3).stream().distinct().toList());
		

}
}
