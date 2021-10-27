import java.util.stream.Stream;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class Runner {

	
	public static void main(String[] args) {
		
		//Importing the Stream API
		
		//import java.util.stream.Stream;
		//import java.util.stream.Collectors;
		
		
		//Exercise 1:
		//Given the following List of names, using a stream, 
		//have it print "Hello " in front of each name besides "James".
		//("Michael", "Dean", "James", "Chris")
		
		
		
		//Potential solution:
		
		//1-Set up the list		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		
		//2-Use For Each Method - this will print Hello "name" for every item inside the list
		names.stream().forEach(i -> System.out.println("Hello " + i));
		System.out.println("====");
		
		//3-Use Filter Method to filter out "James" from the list
		// Use !str.startWith() (! - negative)
		List<String> result = 
				names.stream()
				.filter(str -> !str.startsWith("J"))
				.collect(Collectors.toList());
		result.stream().forEach(i -> System.out.println("Hello " + i));
		
		//4-Compare the two lists, print the name out but add "Hello" to he items present in both lists
		//List<String> finalNames = 
		//		names.stream().
		// - have no idea how to do that
		
			
		//5 Another try after Google search - using Consumer action
		System.out.println("====");
		List<String> names2 = Arrays.asList("Michael", "Dean", "James", "Chris");
		
		Consumer<String> action = i -> {
			if (i == "James" ) {
				System.out.println(i);
				}else {System.out.println("Hello " + i);
				}
		};
		names2.stream().forEach(action);
		
		
		
		
		
		

	}

	

}
