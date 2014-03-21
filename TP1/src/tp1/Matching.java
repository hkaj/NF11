package tp1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Matching {
	public abstract boolean doesMatch(String text);
	
	protected boolean doesMatch(String pattern, String text) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		return m.matches();
		
	}

}
