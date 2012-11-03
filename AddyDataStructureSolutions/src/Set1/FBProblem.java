package Set1;

import java.util.ArrayList;
import java.util.HashMap;

public class FBProblem {

	public void setsWithSumZero(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int p : arr) {
			map.put(p, 1);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				int numNeeded = 0;
				/*if (sum < 0) {
					numNeeded = Math.abs(sum);
				} else {
					numNeeded = 0 - sum;
				}*/
				if (map.get(-1*numNeeded) != null) {
					System.out.print(arr[i] + ":" + arr[j] + ":" + numNeeded);
					System.out.println("\n");
				}
			}
		}
	}
}
