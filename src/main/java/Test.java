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
		System.out.println(map.get(null));

	}

}
