package CollectionsApiPractice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Manipulation {

	public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();
	list.add("Harshit");
	list.add("Suhani");
	list.add("Pulkit");
	list.add("Shubh");
	list.add("Advik");
	list.add("Kajal");
	list.add("Anjul");
	list.add("Prachi");
	list.add("relatives");
	list.add("rishtedaar");
	System.out.println("All of my family members:"+list+"\n"+"Size of family now: "+ list.size());
	System.out.println("My name: "+list.get(0));
	System.out.println("Removing Relatives from Object name:"+list.remove("relatives"));
	System.out.println(list+"\n"+"Size of family now: "+ list.size());
	System.out.println("Removing Rishtedaar from index number:"+list.remove(8));
	System.out.println(list+"\n"+"Size of family now: "+ list.size());
	System.out.println("Checking if Shubh is at home: "+list.contains("Shubh"));
	
	
	
	
	
	
	}
}
