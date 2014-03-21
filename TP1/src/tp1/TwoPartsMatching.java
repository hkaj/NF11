package tp1;

public class TwoPartsMatching extends Matching {

	@Override
	public boolean doesMatch(String text) {
		return doesMatch("([a-zA-Z]{2,5})\\1", text);
	}

}
