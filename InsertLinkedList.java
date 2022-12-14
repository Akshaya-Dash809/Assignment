package Lab_12_Dec;
import java.util.*;

public class InsertLinkedList {
	public static void main(String[] args) {
		// create an empty linked list
		LinkedList <String> l_list = new LinkedList <String> ();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Add Yellow After Red: " + l_list);
		l_list.add(1, "Yellow");
		System.out.println("The linked list:" + l_list);
	}
}

