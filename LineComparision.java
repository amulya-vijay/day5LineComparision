package com.linecomparision;

import java.util.Scanner;
class Length{
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
	double length() {
		double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return length;
	}
}
public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Enter the two end points of the line in the order[(x1,y1),(x2,y2)]");
		Length ip1=new Length();
		//ip1.takeInputs();
		double l1=ip1.length();
		System.out.println("Length="+l1);
	}
}