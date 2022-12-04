
public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(Student that) {

		return Integer.compare(that.id, this.id);
	}

}
