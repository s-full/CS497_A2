//import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {		
		System.out.println("Hello, world!");

		int[] test1 = new int[]{1,2,3,1,23,3,1,3,3};
		System.out.println(MajorityElement.MajorityElement(test1)); 

		int[] test2 =new int[]{3,2,1,5,6,4};
		System.out.println(kLargest(test2, 2));
	}
}