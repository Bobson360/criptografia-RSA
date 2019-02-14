import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringToAscii {
	public static void toAscii() {
		
		Map<Integer, Character> StToHash = new LinkedHashMap<Integer, Character>();
		
		
		String nome = "Robson";
		Integer a = 0;
		char b = ' ';
		String nomeHash="";
		
		for(int i = 0; i < nome.length(); i++) {
			a= (int)nome.charAt(i);
			b = nome.charAt(i);
			StToHash.put(a, b);
//			System.out.println((int)nome.charAt(i));
		}
		System.out.println(StToHash);
		
	}
}
