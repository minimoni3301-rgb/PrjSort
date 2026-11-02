package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Member {
	
	private int mno;

	
	
	
	
	public Member(int mno) {
		this.mno = mno;
	}

	@Override
	public String toString() {
		return "Member [mno=" + mno + "]";
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}
	
	
	
	
}

public class TestClassArrayListSort {

	public static void main(String[] args) {
		ArrayList<Member> mList = new ArrayList<>( 
			Arrays.asList(
					new Member(22), new Member(29),new Member(6),new Member(9), 
			        new Member(12), new Member(80),new Member(17),new Member(7) )
			
		);
		
		dispList(mList);
		/*
		Collections.sort( mList, new Comparator<Member>() {

			@Override
			public int compare(Member m1, Member m2) {
				return m1.getMno() - m2.getMno();
			}
		} );
		
		*/
		
		
		System.out.println("----------------------------------------");
		
		
		Collections.sort( mList,(m1,m2) ->m1.getMno() - m2.getMno());
		dispList(mList);

	}

	private static void dispList(ArrayList<Member> mList) {
		for (Member member : mList) {
			System.out.println(member + " ");
		}
		
	}

}
