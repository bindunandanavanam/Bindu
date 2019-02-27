package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAnagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string 1");
		ArrayList al = new ArrayList<>();
		String s1 = sc.next();
		char st1[] = s1.toCharArray();
		for (int i = 0; i < st1.length; i++) {
			al.add(st1[i]);
		}

		System.out.println(al);
		System.out.println("enter string 2");
		String s2 = sc.next();
		ArrayList al2 = new ArrayList<>();
		char st2[] = s2.toCharArray();
		for (int i = 0; i < st1.length; i++) {
			al2.add(st2[i]);
		}
		System.out.println(al2);
		Collections.sort(al);
		Collections.sort(al2);
		System.out.println(al);
		System.out.println(al2);
		if (al.equals(al2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
