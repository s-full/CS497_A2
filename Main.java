//import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {		
		System.out.println("Hello, world!");

		int[] test1 = new int[]{2,2,1,1,1,2,2};
		System.out.println(MajorityElement.MajorityElement(test1)); 

		int[] test2 =new int[]{3,2,1,5,6,4};
		System.out.println(kLargest.kLargest(test2, 4));

		int[] nums3 = new int[]{3,6,9,1};
		System.out.println(MaxGap.MaxGap(nums3));

		String s1 = "bcabc";
		System.out.println(RemoveDups.RemoveDups(s1));

		String s2 = "cbacdcbc";
		System.out.println(RemoveDups.RemoveDups(s2));

		//int[] test3
	}
}