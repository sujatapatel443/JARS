package com.sp.utilpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab621 {
	public static void main(String[] args) {
		Set set=new LinkedHashSet();
		St s1=new St(10);
		St s2=new St(20);
		St s3=new St(30);
		St s4=new St(20);
		set.add(s1);set.add(s2);set.add(s3);set.add(s4);
		System.out.println(set);
		}
		}

		class St{
			int sid;
			static int i;

			St(int sid) {
				this.sid = sid;
			}

			@Override
			public String toString() {
				// System.out.println("toString");
				return sid + "";
			}

			@Override
			public int hashCode() {
				System.out.println("hashCode");
				return sid;
			}

			@Override
			public boolean equals(Object obj) {
				System.out.println("equals");
				return true;
			}

			
		}