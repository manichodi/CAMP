package com.demo.TestFirst;

public  class ReturnMethod {
	public int add (int a,int b) {

		int z = a + b;
		return z;
	
		
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		ReturnMethod M = new ReturnMethod();
		
		System.out.println(M.add(200,300));		
	}
}