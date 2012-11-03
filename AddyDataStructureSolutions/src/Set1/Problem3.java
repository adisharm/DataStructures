package Set1;

public class Problem3 {

	public String removeDuplicates(char[] c) {
		int start = 0;
		int flag = 0;
		for (int p = 0; p < c.length; p++) {
			int pos = c[p] - 'a';
			if ((flag & (1 << pos)) != 0) {
				char ch = c[p];
				
			} else {
				flag = flag | (1 << pos);
				start++;
			}
		}
		return c.toString().substring(0, start);
	}
}
