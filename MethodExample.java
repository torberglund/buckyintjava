import java.util.*;
public class MethodExample {
	public static void main(String [] args) {
		Integer [] iray = {1,2,3,4};
		Character [] cray ={'a','b','c','d'};

		printMe(iray);
		printMe(cray);


	}

	public static void printMe(Integer [] i) {
		for(Integer x :i )
			System.out.printf("%s ",x);
			System.out.println();
	}

		public static void printMe(Character [] i) {
		for(Character x :i )
			System.out.printf("%s ",x);
			System.out.println();
	}
}