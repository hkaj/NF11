package tp1;

public class NoAEMatching extends Matching {

	@Override
	public boolean doesMatch(String text) {
		return doesMatch("([b-df-z])+", text);
	}

}
