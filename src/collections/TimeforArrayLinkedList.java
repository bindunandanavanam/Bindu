package collections;
import java.io.*;
import java.util.*;
public class TimeforArrayLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("linked list");
		for (int i = 0; i < 10e5; i++) {
		ll.add(10);	
		}
		long start=System.currentTimeMillis();
		System.out.println("in progress");
		for (int i = 0; i < 10e5; i++) {
			ll.add(10);	
			}
		long end= System.currentTimeMillis();
		System.out.println("linked list "+(end-start));
		System.out.println("array list");
		for (int i = 0; i < 10e5; i++) {
			al.add(10);	
			}
		long start1=System.currentTimeMillis();
		System.out.println("in progress");
		for (int i = 0; i < 10e5; i++) {
			al.add(10);	
			}
		long end1= System.currentTimeMillis();
		System.out.println("array list "+(end1-start1));
	}

}
