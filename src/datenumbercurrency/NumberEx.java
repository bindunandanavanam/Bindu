package datenumbercurrency;

import java.text.*;
import java.util.*;

public class NumberEx {
	static void printNumber(Locale locale) {
		double dbl = 105000.3245;
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		String number = formatter.format(dbl);
		System.out.println(number + " for the locale " + locale);
	}

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);
		int myNumber = nf.parse(myString);
		
		String myString = NumberFormat.getInstance().format(myNumber);
		
		printNumber(Locale.UK);
		printNumber(Locale.US);
		printNumber(Locale.FRANCE);
		printNumber(Locale.JAPAN);

		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("ITALY representation of " + d + " : " + nf.format(d));
		
		NumberFormat nf = NumberFormat.getInstance();
		 for (int i = 0; i < myNumber.length; ++i) {
		     output.println(nf.format(myNumber[i]) + "; ");
		 }
		 }
}
