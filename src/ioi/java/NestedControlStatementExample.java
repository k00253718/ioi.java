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
public class NestedControlStatementExample
{

    public static void IfElseIFWorkingAgeOverkillExample1(int age)
    {
	System.out.println("if-elseif: Working Age Overkill Example");
	int minimumWorkingAge = 16;
	int retirementAge = 65;

	boolean underAgeResult = (age < minimumWorkingAge);
	boolean retirementAgeResult = (age >= retirementAge);
	boolean workingAge = (age >= minimumWorkingAge && age < retirementAge);

	String testWorkingAgeSuccessString = "You can legally work.";
	String testWorkingAgeResultUnderageFailureString = "You cannot legally work.  You are not of the legal age required to work.";
	String testWorkingAgeResultOverageFailureString = "You cannot legally work.  You have passed " + retirementAge + " years old and must claim a pension.";

	System.out.println("I am " + age + " years old.");
	if (workingAge == true)
	{
	    System.out.println(testWorkingAgeSuccessString);
	}
	else //	(workingAge == false)
	{
	    if (underAgeResult == true)
	    {
		System.out.println(testWorkingAgeResultUnderageFailureString);
	    }
	    else
	    {
		if (retirementAgeResult == true)
		{
		    System.out.println(testWorkingAgeResultOverageFailureString);
		}
	    }
	}
    }

    public static void IfElseIFWorkingAgeExample2(int age)
    {
	System.out.println("if-elseif: Working Age Example");
	int minimumWorkingAge = 16;
	int retirementAge = 65;

	boolean underAgeResult = (age < minimumWorkingAge);
	boolean retirementAgeResult = (age >= retirementAge);
	boolean workingAge = (age >= minimumWorkingAge && age < retirementAge);

	String testWorkingAgeSuccessString = "You can legally work.";
	String testWorkingAgeResultUnderageFailureString = "You cannot legally work.  You are not of the legal age required to work.";
	String testWorkingAgeResultOverageFailureString = "You cannot legally work.  You have passed " + retirementAge + " years old and must claim a pension.";

	System.out.println("I am " + age + " years old.");
	if (workingAge == true)
	{
	    System.out.println(testWorkingAgeSuccessString);
	}
	else if (underAgeResult == true)
	{
	    System.out.println(testWorkingAgeResultUnderageFailureString);
	}
	else if (retirementAgeResult == true)
	{
	    System.out.println(testWorkingAgeResultOverageFailureString);
	}

    }

    public static void ifElseIfOverkillExample1()
    {
	System.out.println("if-else if: Overkill Example 1");
	boolean testResult = true;
	String testResultSuccessString = "testResult is true.";
	String testResultFailureString = "testResult is false.";

	if (testResult == true)
	{
	    System.out.println(testResultSuccessString);
	}
	else if (testResult == false)
	{
	    System.out.println(testResultFailureString);
	}
    }

    public static void ifElseIfOverkillExample2()
    {
	System.out.println("if-else if: Overkill Example 2");
	boolean testResult = true;
	String testResultSuccessString = "testResult is true.";
	String testResultFailureString = "testResult is false.";

	if (testResult == true)
	{
	    System.out.println(testResultSuccessString);
	}
	else
	{
	    if (testResult == false)
	    {
		System.out.println(testResultFailureString);
	    }
	}
    }
}
