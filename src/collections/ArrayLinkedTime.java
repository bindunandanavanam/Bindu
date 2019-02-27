package collections;
import java.io.*;
import java.util.*;
//add elements in between
public class ArrayLinkedTime {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				LinkedList<Integer> ll=new LinkedList<Integer>();
				ArrayList<Integer> al=new ArrayList<Integer>();
				System.out.println("linked list");
				ll.add(0, 10);
				ll.add(1,20);
				for (int i = 0; i < 10e4; i++) {
				ll.add(2,30);	
				}
				long start=System.currentTimeMillis();
				System.out.println("in progress");
				for (int i = 0; i < 10e4; i++) {
					ll.addLast(10);	
					}
				long end= System.currentTimeMillis();
				System.out.println("linked list "+(end-start));
				System.out.println("array list");
				for (int i = 0; i < 10e4; i++) {
					al.add(0, 78);;	
					}
				long start1=System.currentTimeMillis();
				System.out.println("in progress");
				for (int i = 0; i < 10e4; i++) {
					al.add(0,10);	
					}
				long end1= System.currentTimeMillis();
				System.out.println("array list "+(end1-start1));
			}

		}

	