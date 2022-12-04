import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Map1 {
public static void main(String[] args) {
	
	
	
	
	try {
		String tt1 = null;
		int[] i1 = { 21, 43 };
		int tt = i1[2];
		tt1.length();

	}

	catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("hey! duffer there's a exception here \n ignoring it for now");
		
	}
	catch (Exception f) {
		System.out.println("yes yes");
	}
	
	Map<String,Integer> map1 = Map.of("q",12,"a",3,"b",45,"c",3);
	System.out.println(map1);
	System.out.println(map1.get("q"));
	
	Map<String, Integer> hMap = new HashMap<>(map1);
	System.out.println(hMap);
	hMap.put("D", 23);
	System.out.println(hMap);
	
	System.out.println("\n\n\n\n");

	String str = "This is a big line, and it needs to be tesged quick as possible";

	Map<Character, Integer> map2 = new HashMap<>();
	char[] str1 = str.toCharArray();

	for (char ch : str1) {
		Integer i = map2.get(ch);
		if (ch == ' ') {
			continue;
		} else if (ch == ',') {
			continue;
		} else if (i == null) {
			map2.put(ch, 1);
		} else {
			map2.put(ch, i + 1);
		}

	}
	System.out.println(map2);

	System.out.println("\n\n\n\n");

	// String str = "This is a big line, and it needs to be tesged quick as
	// possible";

	Map<String, Integer> map3 = new HashMap<>();
	String[] str2 = str.split(" ");
	ArrayList<String> nn = new ArrayList<>();
	nn.toArray();
	for (String ch1 : str2) {
		Integer i1 = map3.get(ch1);

		if (i1 == null) {
			map3.put(ch1, 1);
		} else {
			map3.put(ch1, i1 + 1);
		}

	}
	System.out.println(map3);

}
}
