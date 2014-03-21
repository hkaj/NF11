package tp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterFind {
	protected Matcher createMatcher(String pattern, String text) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		return m;		
	}
	
	public String find(String text) {
//		Matcher matcher = createMatcher("[^0-9][0-9](.+?)[0-9]{2}", text);
		Matcher matcher = createMatcher("(?<=[^0-9][0-9]).+?(?=[0-9]{2})", text);
//		Matcher matcher = createMatcher("(?<=[^0-9][0-9]).+(?=[0-9]{2})", text);
		if (matcher.find()) {
			System.out.println(matcher.group());
		}
		return "";
		
	}
	
	public static void main(String[] args) {
		CharacterFind c = new CharacterFind();
		c.find("25.3a512b.3.5135");
	}
	
}
