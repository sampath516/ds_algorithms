import java.util.HashMap;
import java.util.Map;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String> ();
		map.put(null, "abc");
		map.put(null, "xyz");
		map.get("");
		System.out.println(map.get(null));
		char[] s = "String".toCharArray();
		int[] arr = new int[s.length];
		System.out.println(s.length);

	}

}
