package tp1;

public class WithIAndEMatching extends Matching {

	@Override
	public boolean doesMatch(String text) {
		return doesMatch("[A-Za-z]+(?<=i)(?<=e+)", text);
	}

}
