/*
Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/ 
//basic operations of calculator


package com.project.tandemloop.problems;
import java.util.*;

class Calculator1 {
	double a ,b;
	Calculator1(double a,double b){
		this.a=a;
		this.b=b;
	}
	double add() {
		return a+b;
	}
	double sub() {
		return a-b;
	}
	double multiply() {
		return a*b;
		
	}
	double division() {
		if(b==0) {
			System.out.println("error:division by zero");
			return 0;
		}
		return a/b;
	}}
	public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		double a=sc.nextDouble();
		
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		
		System.out.println("Enter operation(add,sub,multiply,division): ");
		String operation =sc.next();
		
		Calculator1 calc =new Calculator1(a, b);
		
		double result=0;
		switch(operation) {
		case "add":
			result =calc.add();
			break;
		
		case "sub":
			result=calc.sub();
			break;
			
		case "multiply":
			result=calc.multiply();
			break;
		
		case "div":
			result=calc.division();
			break;
			
		default:
			System.out.println("invalid operation");
			return;
			
		}
			
			
		
	System.out.println("Result:" +result);

	}

}
