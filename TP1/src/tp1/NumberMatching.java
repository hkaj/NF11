package tp1;

public class NumberMatching extends Matching {

	@Override
	public boolean doesMatch(String text) {
		return doesMatch("-?[0-9]+\\.[1-9][0-9]*", text);
	}

}
