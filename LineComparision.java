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
	public static double l1;
	public static double l2;
	String line1=l1+" ";
	String line2=l2+" ";
	
	public static void main(String[] args) {
		 System.out.println("Enter the two end points of the line1 in the order[(x1,y1),(x2,y2)]");
		Length ip1=new Length();
		Length ip2=new Length();
		l1=ip1.length();
		 System.out.println("Enter the two end points of the line2 in the order[(x1,y1),(x2,y2)]");
		l2=ip2.length();
		System.out.println("Length of line 1="+l1);
		System.out.println("Length of line 2="+l2);
		LineComparision lp = new LineComparision();
		int eq=lp.equalLine();
		if(eq==0) {
		lp.compareLines();
		}
	}
	public int equalLine() {
		if(line1.equals(line2)) {
			System.out.println("Line1 and Line2 are equal in length");
			return 1;
		}else {
			System.out.println("Line1 and Line2 are not equal in length");
			return 0;
		}
	}
	public void compareLines() {
		if(l1>l2) {
			System.out.println("Length(line1) > Length(line2)");
		}else if(l1<l2) {
			System.out.println("Length(line1) < Length(line2)");
		}else {
			System.out.println("Length(line1) = Length(line2)");
		}
		
	}
}
