package collections;

import java.util.TreeSet;

public class PersonSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> persons=new TreeSet<>();
		
		persons.add(new Person(170, 180, "Abhi"));
		persons.add(new Person(160, 170, "Mah"));
		persons.add(new Person(170, 175, "Aman"));
		
		for(Person person:persons) {
			System.out.println(person);
		}

	}

}
