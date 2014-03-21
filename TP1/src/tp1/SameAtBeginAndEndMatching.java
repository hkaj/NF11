package tp1;

public class SameAtBeginAndEndMatching extends Matching {

	@Override
	public boolean doesMatch(String text) {
		return doesMatch("(.)(.).*((\\1\\2)|(\\2\\1))", text);
	}

}
