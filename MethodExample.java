import java.util.*;
public class MethodExample {
	public static void main(String [] args) {
		//Integer [] iray = {1,2,3,4};
		//Character [] cray ={'a','b','c','d'};

		//printMe(iray);
		//printMe(cray);

		System.out.println(max(432,54,5443543));
		System.out.println(max("apples","poop","beta"));


	}
	/*
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
	*/

	//generic method
	public static <T> void printMe(T[] x) {
		for(T i :x )
			System.out.printf("%s ",i);
			System.out.println();
	}

	public static <T extends Comparable<T>> T max(T a, T b, T c){
		T m = a;
		if(b.compareTo(m) >0)
			m= b;

		if(c.compareTo(m) >0)
			m= c;
		return m;
	}
}