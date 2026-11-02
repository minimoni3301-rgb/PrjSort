package sort;

import java.util.Arrays;
import java.util.Collections;

public class TestArraySort {

	
	
	public static void main(String[] args) {
		
		
	//	int  []  arr1   =   new int[] {
	int [] arr1 = {1,5,3,2,4};
	System.out.println(arr1); // [I@6b95977
	System.out.println(Arrays.toString(arr1)); // for문 대신 사용 
	
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1)); 
	// Stream 문법
	arr1 = Arrays.stream(arr1)
	             .boxed()
	             .sorted(Collections.reverseOrder())
	             .mapToInt(Integer::intValue)
	             .toArray();
	System.out.println(Arrays.toString(arr1));
	
	
	// 람다식은 class 대상으로만 가능 
	// Arrays.sort(arr1,(a,b)->{return b-a;});-> error 
	
	Integer []  arr2 = {1,5,3,2,4};
	Arrays.sort(arr2,(a,b) -> {return b-a;});
	System.out.println(arr2);
	System.out.println(Arrays.toString(arr2));// 아래 for문 대신 사용 
	
	
	System.out.println("-------------------------------------");
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+ " ");
	}
	
	
	System.out.println();
	
	 String [] names = {"가나","루나","지나","사나"};
	 System.out.println(Arrays.toString(names));
	 Arrays.sort(names, (a,b)->b.compareTo(a));
	 System.out.println(Arrays.toString(names)); // 아래 for문 대신 사용 
	 
	 
	 System.out.println();
	 
	 for (String name : names) {
		System.out.print(name+ " ");
	}
				
	
	}
		
	}


