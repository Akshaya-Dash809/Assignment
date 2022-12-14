package Lab_12_Dec;
import java.util.*;
//2. WJP of swap two elements in a linked list.

public class SwapLinkedList { 
public static void main(String a[]){
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("C");
		list.add("SQL");
		list.add("PLSQL");
		list.add("PYTHON");
		list.add("HTML");
		list.add("CSS");
		
		Collections.swap(list, 2, 5);
		System.out.println("After Swaping:");
		for(String str: list){
			System.out.println(str);
		}
	}
}
