import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

	private ArrayList<Person> persons;

	public Employees() {
		this.persons = new ArrayList<Person>();
	}

	public void add(Person personToAdd) {
		this.persons.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd) {
		for (Person person : peopleToAdd) {
			persons.add(person);
		}
	}

	public void print() {
		Iterator<Person> itr = persons.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void print(Education education) {
		Iterator<Person> itr = persons.iterator();
		while (itr.hasNext()) {
			Person personItr = itr.next();
			if (personItr.getEducation().equals(education)) {
				System.out.println(personItr);
			}
		}
	}

	public void fire(Education education) {
		persons.removeIf(p -> p.getEducation().equals(education));
	}
}
