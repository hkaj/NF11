package tp1;

public class ArgsMatching extends Matching {
	@Override
	public boolean doesMatch(String text) {
		return doesMatch(".*\"args\".*\\[([0-9]+,?)*\\].*", text);
	}
}
