import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class UsingCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer value1, Integer value2) {
		// TODO Auto-generated method stub
		return Integer.compare(Integer.valueOf(value2), Integer.valueOf(value1));
	}

}
public class CollectionQueue {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> queue = List.of(12, 45, 3232, 1, 99370);
		Queue<Integer> q1 = new PriorityQueue<>(new UsingCompare());
		q1.addAll(queue);
		System.out.println(q1);
		// System.out.println(q1.poll());
		System.out.println(q1);
	}

}

