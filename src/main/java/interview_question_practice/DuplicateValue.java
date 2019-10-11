package interview_question_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValue {// how to remove duplicate value from list

	public static void main(String[] args) {
		
		/*
		 * List<String> list = Arrays.asList("rubel","rubel","rubel"); Set<String> s
		 * =new HashSet<String>(list); System.out.println(s);
		 */
			
		List<String> list = Arrays.asList("rubel","rubel","rubel");
		List<String> listDistinct =list.stream().distinct().collect(Collectors.toList());
		System.out.println(listDistinct);
	}

}
