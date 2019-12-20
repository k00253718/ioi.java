/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioi.java;

/**
 *
 * @author k00253718
 */
public class ControlStatementExample
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
	ifElseExample1();
	ifElseExample2();
	ifElseExample3A(16);
	ifElseExample3A(18);
	ifElseExample3B(25);
    }

    public static void ifElseExample1()
    {
	System.out.println("if-else: Example 1");
	boolean testResult = true;
	String testResultSuccessString = "testResult is true.";
	String testResultFailureString = "testResult is false.";

	if (testResult)
	{
	    System.out.println(testResultSuccessString);
	}
	else
	{
	    System.out.println(testResultFailureString);
	}
    }

    public static void ifElseExample2()
    {
	System.out.println("if-else: Example 2");
	boolean testResult = false;
	String testResultSuccessString = "testResult is true.";
	String testResultFailureString = "testResult is false.";

	if (testResult)
	{
	    System.out.println(testResultSuccessString);
	}
	else
	{
	    System.out.println(testResultFailureString);
	}
    }

    public static void ifElseExample3A(int age)
    {
	System.out.println("if-else: Example 3");
	int votingAge = 18;
	boolean votingAgeTestResult = (age >= votingAge);
	String testResultSuccessString = "You can vote.";
	String testResultFailureString = "You cannot vote.  You are not of the legal age required to vote.";

	System.out.println("I am " + age + " years old.");
	if (votingAgeTestResult)
	{
	    System.out.println(testResultSuccessString);
	}
	else
	{
	    System.out.println(testResultFailureString);
	}
    }

    public static void ifElseExample3B(int age)
    {
	System.out.println("if-else: Example 3");
	int votingAge = 18;
	String testResultSuccessString = "You can vote.";
	String testResultFailureString = "You cannot vote.  You are not of the legal age required to vote.";

	System.out.println("I am " + age + " years old.");
	if (age >= votingAge)
	{
	    System.out.println(testResultSuccessString);
	}
	else
	{
	    System.out.println(testResultFailureString);
	}
    }
}
