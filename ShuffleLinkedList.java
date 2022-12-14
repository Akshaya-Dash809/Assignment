//WJP to shuffle the elements in a linked list
package Lab_12_Dec;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {
	public static void main(String[] args) {
		// create list
		LinkedList<String> l = new LinkedList<String>();
		l.add("Pallabi");
		l.add("AKD");
		l.add("Soumya");
		l.add("Nisha");
		l.add("Abhishek");
		l.add("Misbah");
		System.out.println("List: " + l);
		Collections.shuffle(l); // using shuffle() method
		System.out.println("After Shuffle,Updated List: " + l);
	}

}