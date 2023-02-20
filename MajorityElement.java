import java.util.HashMap;

public class MajorityElement {
	public static int MajorityElement(int[] list) {
		//load elements of list into a HashMap
		HashMap<Integer,Integer> myMap = new HashMap<>();
		int sol = -99;

		for (int i = 0; i < list.length; i++) {
			
			if (myMap.containsKey(list[i])) {
				myMap.put(list[i], myMap.get(list[i])+1);
			}
			else {
				myMap.put(list[i], 1);
			}
			if (myMap.get(list[i]) > list.length/2) {
				sol = list[i];
			}
		}
		return sol;
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
 }
}