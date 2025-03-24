package cloverProject.Imp;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//count the no .occurrence of word in given string using  java 8



public class Occurance{
	public static void main(String[] args) { 
String str = "apple banana apple orange banana apple";
Map<String, Long> wordCount = Arrays.stream(str.split(" "))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

System.out.println(wordCount);

}
}