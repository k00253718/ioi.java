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
	ifElseExample();
    }

    public static void ifElseExample()
    {
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

}
