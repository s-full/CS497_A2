import java.util.HashMap;

public class MajorityElement {
	public static int MajorityElement(int[] list) {

		// load elements of list into a HashMap
		HashMap<Integer,Integer> myMap = new HashMap<>();
		int sol = Integer.MIN_VALUE;

		for (int ele : list) {
			
			if (myMap.containsKey(ele)) {
				
			}
		}

		return 0;
	// 	int candidate=0;
	// 	int count = 0;

	// 	for (int ele:list) {
	// 		if (count == 0) {
	// 			candidate = ele;
	// 			count =1;
	// 		}
	// 		else if (ele == candidate) {
	// 			count++;
	// 		}
	// 		else {
	// 			count--;
	// 		}
	// 	}
	// 	return candidate;
	// }
}