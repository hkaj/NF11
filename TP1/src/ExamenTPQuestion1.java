import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExamenTPQuestion1 {
	public static void test(String text) {
		Pattern p = Pattern.compile("(\\w*(\\w{2,})\\w*\\2\\w*)");
		Matcher m = p.matcher(text);
		if (m.find()) {
			System.out.println(m.group(1));
		}		
	}
	public static void main(String[] args) {
		test("le traitre et l'innocent");
		test("le patinage artistique");
		test("ils entreprennent un devoir difficile");
	}
}
