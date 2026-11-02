package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> list   =  new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(34);
		list.add(28);
		list.add(16);
		
		dispList (list); // 정렬되지 않은 무순위
		// 정렬방법이 여러가지
		
	
		
		
		System.out.println();
		
		// compAsc
		// Comparator 인터페이스를 이용하여 이름이 없는 클래스(익명 클래스)에 코딩을
		// 추가하여 인터페이스 new 할 수 있다. 
		// 익명 : Anonymous 이름 없는 
		// 람다식이 나오기 이전 버전 
		Comparator<Integer> compAsc = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1-o2;
			}
		
		};
		
		Comparator<Integer> compDesc = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1; // 이건 숫자일때만 가능함 
			}
			
			
		};
			
			
		// 오름차순 정렬해서 출
		Collections.sort(list,compAsc);
		dispList (list);// 오름차순정렬
		
		
		
		// 내림차순 정렬해서 출력
		Collections.sort(list,compDesc);
		dispList (list);
	
		
		
		
		//--------------------------------------------------------------------------------------
		// 문자열 
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("강지우");
		names.add("안효욱");
		names.add("김상우");
		names.add("박진영");
		names.add("강서인");
		
		
		dispName( names );
		
		// 오름차순으로 정렬
		Collections.sort(names,new Comparator<String>()  {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		dispName( names );
		
		
		
		//내림차순으로 정렬
		/*Collections.sort(names,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		*/
		/*
		Collections.sort(names,(o1,o2)->{
			return o2.compareTo(o1);
		});
		*/
		
		Collections.sort(names,(o1,o2)->o2.compareTo(o1));  // 람다식
		dispName( names );
		
	}
	
	//모든 익명 클래스는 람다식으로 바꿀 수 없다. (함수가 한개일때만 가능), 인터페이스가 2,3 일때는 익명 클래스를 쓸 수 밖에 없다.
	
	
    // 이름출력(create method 사용)
	private static void dispName(ArrayList<String> names) {
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
	}
	
    // 숫자출력
	private static void dispList(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");			
		}
		
		
		
		
		
	}

}
