package com.object;

import java.lang.*;

public class CloneMethod {

	public static void main(String[] args) {
		System.out.println("state 0--");
		try {
			System.out.println("state 1--");
			try {
				System.out.println("state 2---");
			}catch(Exception ex) {
				System.out.println("state 3---");
			}finally {
				System.out.println("state 4---");
			}System.out.println("state 5---");
		
		}catch(Exception ex) {
			System.out.println("state 6--");
			try {
				System.out.println("state 7---");
			}catch(Exception e1) {
				System.out.println("state 8---");
			}finally {
				System.out.println("state 9---");
			}
			System.out.println("state 10---");
		}finally {
		System.out.println("state 11---");
		try {
			System.out.println("state 12---");
		}catch(Exception ex) {
			System.out.println("state 13---");
		}finally {
			System.out.println("state 14---");
		}
		System.out.println("state 15---");
		}
		System.out.println("state 16----");
			
	

		
	}		
}