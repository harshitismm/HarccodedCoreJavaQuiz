package CollectionsApiPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
	//using array list with object datatype
//	public static void main(String[] args) {
//		Collection list= new ArrayList();
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		
//		System.out.println(list);//We can directly print a collection
//		for(Object n:list) {
//			System.out.println(n);
//		}
//	}
	/*
	//using array list with Integer datatype
	*
	*
	*
	*/
	
	
	public static void main(String[] args) {
		Collection<Integer> list= new ArrayList<Integer>();
		list.add(6);
		list.add(7);
		list.add(8);
		
		System.out.println(list);//We can directly print a collection
		for(Integer n:list) {
			System.out.println(n);
		}
	}

	
}
