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
    }

    public static void ifElseExample1()
    {
	System.out.println("if-else: Example 1");
	boolean testResult = true;
	String testResultSuccessString = "testResult is true";
	String testResultFailureString = "testResult is false";

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
	String testResultSuccessString = "testResult is true";
	String testResultFailureString = "testResult is false";

	if (testResult)
	{
	    System.out.println(testResultSuccessString);
	}
	else
	{
	    System.out.println(testResultFailureString);
	}
    }

}
