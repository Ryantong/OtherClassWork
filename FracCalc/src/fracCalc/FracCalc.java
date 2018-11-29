package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
    	String temp = input.next();
    	while(!temp.equals("quit")) {
    		System.out.println(produceAnswer(temp));
    		//print result
    		temp = input.next();
    	}
    	input.close();
        // TODO: Read the input from the user and call produceAnswer with an equation
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    {
    	String[] arr = input.split(" ");
    	String firstOp = arr[0];
    	String Operator = arr[1];
    	String secondOp = arr[2];
    	
    	String[] arr1 = partFrac(firstOp);
    	int wholeNum1 = Integer.parseInt(arr1[0]);
    	int numer1 = Integer.parseInt(arr1[1]);
    	int denom1 = Integer.parseInt(arr1[2]);
    	int mixedFrac1 = toImproperFrac(wholeNum1, numer1, denom1);
    	
    	String[] arr2 = partFrac(secondOp);
    	int wholeNum2 = Integer.parseInt(arr2[0]);
    	int numer2 = Integer.parseInt(arr2[1]);
    	int denom2 = Integer.parseInt(arr2[2]);
    	int mixedFrac2 = toImproperFrac(wholeNum2, numer2, denom2);
  
    	//return "whole:" + wholeNum2 + " numerator:" + numer2 + " denominator:" + denom2;
    	int commonDenom = denom1 * denom2;
    	int newNumer1 = denom2 * mixedFrac1;
    	int newNumer2 = denom1 * mixedFrac2;
    	if(Operator.equals("+")) {
    		return newNumer1 + newNumer2 + "/" + commonDenom;
    	}else if(Operator.equals("-")) {
    		return newNumer1 - newNumer2 + "/" + commonDenom;
    	}else if(Operator.equals("*")) {
    		return newNumer1 * newNumer2 + "/" + commonDenom;
    	}else{
    		return newNumer1 / newNumer2 + "/" + commonDenom;
    	}
    	
    	
    	
    	
    	
        // TODO: Implement this function to produce the solution to the input
    }
    //[0] = whole [1] = numer [2] = denom
    public static String[] partFrac(String str) {
    	String[] partFrac = new String[3];
    	if(str.indexOf("/") == -1) {//if no frac
			partFrac[0] = str;
			partFrac[1] = "0";
			partFrac[2] = "1";
    	}else {
    		if(str.indexOf("_") == -1) {//if only frac
    			partFrac[0] = "0";
    			String[] temp = str.split("/");
    			partFrac[1] = temp[0];
    			partFrac[2] = temp[1];
    		}else {//if have both whole and frac
    			String[] temp = str.split("_");
    			partFrac[0] = temp[0];//wholeNum
    			String[] temp2 = temp[1].split("/");
    			partFrac[1] = temp2[0];//Numer
    			partFrac[2] = temp2[1];//Denom	
    		}
    	}
    	return partFrac;
    }
	public static int toImproperFrac(int wholeNum, int numer, int denom) {
		int fracNumer = denom * wholeNum + numer;
		return fracNumer;
	}
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
