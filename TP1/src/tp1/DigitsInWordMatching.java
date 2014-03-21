package tp1;

public class DigitsInWordMatching extends Matching {

	@Override
	public boolean doesMatch(String text) {
		return doesMatch("(?i)[a-z]+[0-9]+[a-z]+", text);
	}

}
