import java.util.ArrayList;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("karthik", "Adini", 28);
		Person p2 = new Person("kar", "Adi", 27);
		Person p3 = new Person("karthi", "Ad", 26);
		Person p4 = new Person("kar", "Adin", 25);
		List<Person> persons = new ArrayList();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		System.out.println(persons);
	}

}
