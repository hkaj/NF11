package tp1;


public class IntegerMatching extends Matching {
	public boolean doesMatch(String text) {
		return doesMatch("-?[1-9][0-9]*", text);
	}
}
