package sort;

import java.util.Arrays;

class Student implements Comparable {
	
	private int sno;

	
	
	
	public Student(int sno) {
		super();
		this.sno = sno;
	}




	@Override
	public String toString() {
		return "Student [sno=" + sno + "]";
	}


    //위에 class Student 에서 생긴거 
    // Comparable interface를 구현하면
	// 오름차순 this.sno - s.sno;
	// 내림차순 s.sno - this.sno
	@Override
	public int compareTo(Object o) {
	Student  s  =  (Student) o;
		return this.sno - s.sno;
	}
	
	
	
}



public class TestClassSort {

	public static void main(String[] args) {
		Student [] studArr = new Student [] {
			new Student (15), new Student (7), new Student(3),
			new Student (11), new Student (9), new Student(27)
		};
		
		dispArr(studArr);
		
		Arrays.sort(studArr);
		dispArr(studArr);
		

	}

	private static void dispArr(Student[] studArr) {
		for (Student student : studArr) {
			System.out.println(student + " ");
			
		}
		
	}

}
