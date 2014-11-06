import java.util.*;
public class bucky {
	public static void main (String [] args) {
	
	String[] things ={"eggs", "lasers", "hats","pie"};
	List<String> list1 = new ArrayList<String>();

	//add arrayitems to list
	for(String x : things)
		list1.add(x);

	String[] morethings ={"lasers","hats"};
	List<String> list2 = new ArrayList<String>();

	for(String x : morethings)
		list2.add(x);
	for(int i=0; i<list1.size(); i++)
		System.out.printf("%s ", list1.get(i));
	};
};