import java.util.*;
public class bucky {
	public static void main (String [] args) {
	
	String[] things ={"apples","nuubs", "eggs", "lasers", "hats","pie"};
	List<String> list1 = new LinkedList<String>();

	for(String x : things)
		list1.add(x);

	String [] things2 = {"sausage", "bacon", "goats", "harrypotter"};
	List<String> list2 = new LinkedList<String>();
	
	for(String x : things2)
	list2.add(x);
	
	list1.addAll(list2);
	list2 = null;

	printMe(list1);
	removeStuff(list1, 2, 5);
	printMe(list1);
	reverseMe(list1);


	};

	private static void printMe(List<String> l) {
		for(String s : l)
			System.out.printf("%s ", s);
		System.out.println();
	}

	private static void removeStuff(List<String> l, int from, int to) {
		l.subList(from,to).clear();
	}

	private static void reverseMe(List<String> l) {
		ListIterator<String> bobby = l.listIterator(l.size());
		while(bobby.hasPrevious())
			System.out.printf("%s ", bobby.previous());
	}


};