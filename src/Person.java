public class Person implements Comparable<Person> {
	private String name;
	private String surName;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, String surName, int age) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return (name + surName + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.name.equals(this.name) && p.surName.equals(this.surName) && p.age == this.age) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Person o) {
		if (o instanceof Person) {
			Person p = (Person) o;
			return p.age - this.age;
		} else {
			throw new IllegalArgumentException("only age can be compared");
		}
	}

}