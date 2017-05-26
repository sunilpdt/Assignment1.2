package com.addition;

import java.util.Scanner;

public class Addition {

	
	public int addNumbers(int x,int y){
		
	int carry;
    while(y!=0)
    {
        carry = x & y;
        x = x ^ y;
        y = carry << 1;
    }
    return x;
    
}
	public static void main(String[] args) {
		
		Addition addition=new Addition();
		System.out.println("Enter 1st number to add:");
		@SuppressWarnings("resource")
		Scanner scanner1=new Scanner(System.in);
		int num1=scanner1.nextInt();
		
		System.out.println("Enter 2nd number to add:");
		@SuppressWarnings("resource")
		Scanner scanner2=new Scanner(System.in);
		int num2=scanner2.nextInt();
		
		System.out.println("Addition of "+num1+" and "+num2+ "is " +addition.addNumbers(num1, num2));
		
		}

}
