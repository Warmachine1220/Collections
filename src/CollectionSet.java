import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {

		Set<String> set1 = Set.of("hii", "bishal", "chamiya");
		System.out.println(set1);

		Set<String> setHS = new HashSet<>(set1);
		setHS.add("ff");
		setHS.add("bishal");
		System.out.println(setHS);

		Set<Integer> Hset1 = new HashSet<>();
		Hset1.add(232);
		Hset1.add(54);
		Hset1.add(78);
		System.out.println(Hset1);

		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(232);
		lhs.add(54);
		lhs.add(78);
		System.out.println(lhs);

		Set<Integer> ts = new TreeSet<>();
		ts.add(232);
		ts.add(54);
		ts.add(78);
		System.out.println(ts);

		System.out.println("haha\n \n");

		List<Character> alpha = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		List<Character> allalpha = new ArrayList<>(alpha);
		System.out.println(allalpha);
		Set<Character> treealpha = new TreeSet<>(alpha);
		System.out.println(treealpha);
		Set<Character> linkalpha = new LinkedHashSet<>(alpha);
		System.out.println(linkalpha);

		// list //set

		TreeSet<Integer> tset = new TreeSet<>(Set.of(324, 12, 43, 231));
		System.out.println(tset);

		System.out.println(tset.floor(45));

	}

}
