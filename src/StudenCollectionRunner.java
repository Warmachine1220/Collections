import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudenCollectionRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> StudentIds = List.of(new Student(12, "bishal"), new Student(45, "bamboo"),
				new Student(32, "champu"));
		System.out.println(StudentIds);

		List<Student> StudentsAl = new ArrayList<>(StudentIds);
		Collections.sort(StudentsAl);
		System.out.println(StudentsAl);

	}

}
