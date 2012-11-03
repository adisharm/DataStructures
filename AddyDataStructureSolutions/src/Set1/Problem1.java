package Set1;

public class Problem1 {

	public boolean hasUniqueChars(String str) {
		int flag = 0;
		for (char c : str.toCharArray()) {
			int pos = c - 'a';
			if ((flag & (1 << pos)) != 0) {
				return false;
			} else {
				flag = flag | (1 << pos);
			}
		}
		return true;
	}
}
