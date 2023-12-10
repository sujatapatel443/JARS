package com.corejava.internationalization;

import java.util.Locale;

public class In18Demo1 {

	public static void main(String[] args) {

		Locale l = Locale.getDefault();
		System.out.println(l);
		System.out.println(l.getCountry() + "\t" + l.getLanguage());

		System.out.println(l.getDisplayCountry() + " " + l.getCountry());

		Locale l2 = new Locale("pa", "In");
		System.out.println(l2);

		String[] s3 = Locale.getISOLanguages();
		for (String s : s3) {
			System.out.print(s + " ");
		}
		System.out.println();

		String[] s4 = Locale.getISOCountries();
		for (String s2 : s4) {
			System.out.print(s2 + " ");
		}

		String[] s5 = Locale.getISOCountries();
		for (String s6 : s5) {
			System.out.print(s6 + " ");
		}
		System.out.println();
		
		Locale[] s=Locale.getAvailableLocales();
		for(Locale s1:s) {
			System.out.print(s1+" ");
		}

	}

}
