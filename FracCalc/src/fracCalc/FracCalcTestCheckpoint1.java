package fracCalc;

import java.util.Scanner;

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
{
    @Test public void testCheckpoint1_1() {  FracCalcTestALL.assertForEarlyCheckpoints("6_5/8", "whole:6 numerator:5 denominator:8", "12_3/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint1_2() {FracCalcTestALL.assertForEarlyCheckpoints("20", "whole:20 numerator:0 denominator:1", "-20_3/7", FracCalc.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint1_3() {FracCalcTestALL.assertForEarlyCheckpoints("27/21", "whole:0 numerator:27 denominator:21", "-33_2/7", FracCalc.produceAnswer("-32 - 27/21"));}

    public static void main(String[] args) 
    {
    	Scanner userInput = new Scanner (System.in);
        // TODO: Read the input from the user and call produceAnswer with an equation
    	System.out.println("Please insert your equation");
    	String input = userInput.nextLine();
    	System.out.println(produceAnswer(input));
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
    	String secondFraction;
    	if(input.indexOf("+") >=0){
    		secondFraction = input.substring(input.indexOf("+")+1);
    		}else if(input.indexOf("-", 3)>=0){
    			secondFraction = input.substring(input.indexOf("-", 3)+1);
    		}else if(input.indexOf("*")>=0){
    			secondFraction = input.substring(input.indexOf("*")+1);
    		}else if(input.indexOf("/", 3)>= 0){ 
    			secondFraction = input.substring(input.indexOf("/", 3)+1);
    		}else{
    			secondFraction = input;
    		}
        
        return secondFraction.trim();
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
  
}