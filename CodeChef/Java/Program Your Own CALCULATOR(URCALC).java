// Program Your Own CALCULATOR 
// Problem Code: URCALC

// Write a program to obtain 2 numbers ( A and B ) and an arithmetic operator (C) and then design a calculator depending upon the operator entered by the user.

// So for example if C="+", you have to sum the two numbers.

// If C="-", you have to subtract the two numbers.

// If C=" * ", you have to print the product.

// If C=" / ", you have to divide the two numbers.

// Input:
// First line will contain the first number A.
// Second line will contain the second number B.
// Third line will contain the operator C, that is to be performed on A and B.
// Output:
// Output a single line containing the answer, obtained by, performing the operator on the numbers. Your output will be considered to be correct if the difference between your output and the actual answer is not more than 10−6.

// Constraints
// −1000≤A≤1000
// −1000≤B≤1000 and B≠0
// C can only be one of these 4 operators {" + ", " - ", " * ", " / "}
// Sample Input:
// 8
// 2
// /
// Sample Output:
// 4.0
// Sample Input:
// 5
// 3
// +
// Sample Output:
// 8

// Solution :

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    double A,B;
	    char C;
	    Scanner sc=new Scanner(System.in);
	    A=sc.nextDouble();
	    B=sc.nextDouble();
	    C=sc.next().charAt(0);
	     switch(C)
	     {
	         case '+': System.out.println(A+B);
	         break;
	         case '-': System.out.println(A-B);
	         break;
	         case '*': System.out.println(A*B);
	         break;
	         case '/': System.out.println(A/B);
	     }
	}
}