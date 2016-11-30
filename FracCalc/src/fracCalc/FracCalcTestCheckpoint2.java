package fracCalc;

import java.util.Scanner;

import org.junit.Test;

// Checkpoint 2-only tests
public class FracCalcTestCheckpoint2
{
    @Test public void testCheckpoint2_1() {  FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:6 numerator:5 denominator:8", "12_3/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint2_2() {  FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:20 numerator:0 denominator:1", "-20_3/7", FracCalc.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint2_3() {  FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:0 numerator:27 denominator:21", "-33_2/7", FracCalc.produceAnswer("-32 - 27/21"));}
    
    public static void main(String[] args)
    {	
    	System.out.println("Please insert your equation");
    	Scanner input=new Scanner(System.in);//scanner
    	String userInput=input.nextLine();
    	while(userInput.equals("quit")!=true){
    		String answer=produceAnswer(userInput);
    		System.out.println(answer);
    		System.out.println("You can continue");
    		userInput=input.nextLine();
    	}
    	System.out.println("Bye");
    }
    public static String produceAnswer(String input)
    {
        String[] split = input.split(" ");
        int[] operand1= parsing(split[0]);
        int[] operand2= parsing(split[2]);
        String answer="whole:"+operand2[0]+" numerator:"+operand2[1]+" denominator:"+operand2[2];
        return answer;
    }
    public static int[] parsing(String operand){
    	String[] part= new String[3];
    	if(operand.indexOf("_")==-1 && operand.indexOf("/")==-1){
    		part[0]=operand;
    		part[1]="0";
    		part[2]="1";
    	} else{
    		if (operand.indexOf("_")>=1){
    			part[0]= operand.substring(0, operand.indexOf("_"));
    			operand = operand.substring (operand.indexOf("_")+1);
    		} else {
    			part[0]="0";
    		}
    		if (operand.indexOf("/")>=1){
    			part[1]= operand.substring(0, operand.indexOf("/"));
    			part[2]= operand.substring( operand.indexOf("/")+1);
    		} else{
    			part[1]="1";
    			part[2]="0";
    		}
    	}
    	int[] number=new int [3];
    	for(int i=0; i<3; i++){
    		number [i]= Integer.parseInt(part[i]);
    	}
    	return number;	
    }
 }
