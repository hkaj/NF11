package tp1;

public class LeMatching extends Matching {

	@Override
	public boolean doesMatch(String text) {
		return doesMatch("(?i)[a-z]+le[a-z]+",text);
	}

}
