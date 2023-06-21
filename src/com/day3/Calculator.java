package com.day3;

public interface Calculator {
	 int add(int a,int b);
	 int sub(int a,int b);
	 int mul(int a,int b);
	 int div(int a,int b);


}
//all methods inside interface are public and abstract
class CalculatorImpl implements Calculator{
	@Override
	public int add(int a,int b) {
          return a+b;
	}
	@Override
	public int sub(int a,int b)
	{
		return a-b;
	}
	@Override
	public int mul(int a,int b) {
		return a*b;
	}
	@Override
	 public int div(int a,int b) {
		return a/b;
	}
}
