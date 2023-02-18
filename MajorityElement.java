import java.util.HashMap;

public class MajorityElement {
	public static int MajorityElement(int[] list) {
		//load elements of list into a HashMap
		HashMap<Integer,Integer> myMap = new HashMap<>();
		int sol = -99;

		for (int ele : list) {
			
			if (myMap.containsKey(ele)) {
				myMap.put(ele, myMap.get(ele)+1);		
			}
			else {
				myMap.put(ele, 1);
			}
			if (myMap.get(ele) > list.length/2) {
				sol = ele;
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