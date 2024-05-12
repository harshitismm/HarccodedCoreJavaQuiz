package CollectionsApiPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSyncronized {
	public static void main(String[] args) {
		List<String> list =Collections.synchronizedList
				(new ArrayList<String>());
		list.add("Suhani");
		list.add("Harshit");
		
		synchronized(list){
		for(String name:list)
			System.out.println(name);
		}
	}
	
	

}
