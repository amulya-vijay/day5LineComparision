package com.linecomparision;

import java.util.Scanner;
class Length{
	double length() {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return length;
	}
}
public class LineComparision {
	public static void main(String[] args) {
		 System.out.println("Enter the two end points of the line1 in the order[(x1,y1),(x2,y2)]");
		Length ip1=new Length();
		Length ip2=new Length();
		String l1=ip1.length()+" ";
		 System.out.println("Enter the two end points of the line2 in the order[(x1,y1),(x2,y2)]");
		String l2=ip2.length()+" ";
		System.out.println("Length of line 1="+l1);
		System.out.println("Length of line 2="+l2);
		if(l1.equals(l2)) {
			System.out.println("Line1 and Line2 are equal in length");
		}else {
			System.out.println("Line1 and Line2 are not equal in length");
		}
	}
}
