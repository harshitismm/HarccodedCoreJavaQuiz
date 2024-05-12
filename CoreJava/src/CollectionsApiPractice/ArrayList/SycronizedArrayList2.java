package CollectionsApiPractice;

import java.util.concurrent.CopyOnWriteArrayList;

public interface SycronizedArrayList2 {
public static void main(String[] args) {
		CopyOnWriteArrayList<String> syncedlist= new CopyOnWriteArrayList<String>();
		syncedlist.add("one");
		syncedlist.add("Two");
		syncedlist.add("Three");
		
		System.out.println("Printing synced list elements:");
		for(String num:syncedlist) {
			System.out.println(num);
		}
}
}
