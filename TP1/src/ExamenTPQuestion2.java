import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExamenTPQuestion2 {	
	public static void test(String text) {
		Pattern p = Pattern.compile("([a-wyz]*(?=au)[a-wyz]*t[a-wyz]*)");
		Matcher m = p.matcher(text);
		if (m.find()) {
			System.out.println(m.group(1));
		}
		else {
			System.out.println("No match");
		}
	}
	public static void main(String[] args) {
		test("la bauxite a un taux d'aluminium authentique");
	}

}
