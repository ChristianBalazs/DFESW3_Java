package com.qa.main;

import java.lang.Math;

public class Calculator {
	
	public static int addMethInt(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	
	public static float addMethFloat(float num1, float num2) {
		float result = num1 + num2;
		return result;
	}

	public static double addMethDouble(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	
	
	
	public static int subMeth(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	
	public static int multiMeth(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	
	public static int divMeth(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	
	
	public static int powerMeth(int num1, int num2) {
		int result = (int) Math.pow(num1, num2);
		return result;
	}

	
}
