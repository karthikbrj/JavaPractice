import java.util.Comparator;

public class StringNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1 instanceof Person && o2 instanceof Person) {
			return o2.getName().length() - (o1.getName().length());
		} else {
			throw new IllegalArgumentException("Only String is Compared");
		}
	}

}
