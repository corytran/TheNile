package model;

import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultListModel;

public class SCmodel {
	public static String SC_storage(int i) {
		
		//DefaultListModel listArrBooks = new DefaultListModel();
		List<String> listArrBooks = Arrays.asList("Solaris Paperback 2013 November 20, 2002 $10.99", "Edgar Allan Poe: Complete Tales and Poems $14.50"
		, "How to Invent Everything: Rebuild All of Civilization $19.99", "The Myth of Sisyphus $14.99", "Milkman: A Novel Paperback 2013 Anna Burns $7.99"
		, "The Maze Runner: Maze Runner, Book 1 $9.99", "The Illustrated Brief History of Time, Updated and Expanded $39.99"
		, "The Odyssey $5.95");
		
		return listArrBooks.get(i);
	}

}
