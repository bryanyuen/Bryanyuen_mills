//Bryan Yuen
//2nd period
//FracCalc Project
package fracCalc;
import java.util.*;
public class FracCalc {
private static final String firstNumerator = null;
private static final String firstDenominator = null;
private static final String improperFraction2 = null;
public static void main(String[] args){
   	System.out.println("Please insert your equation");
   	Scanner input=new Scanner(System.in);//scanner, which accepts userInput
   	String userInput=input.nextLine(); 
   	while(userInput.equals("quit")!=true){ //to check if user types "quit"
   		String answer = produceAnswer(userInput);
   		System.out.println(answer);
   		System.out.println("You can continue");
   		userInput=input.nextLine();
   	}
   	System.out.println("Bye");
   }
   public static String produceAnswer(String input)
   {
       String[] split = input.split(" "); //split the input into first operand, operator, and second operand
       String improperFraction1 = "";
       String improperFraction2 ="";
       String answer = "";
       int [] splitFraction1 = new int [2];
       int [] splitFraction2 = new int [2];
       int[] operand1 = parsingFraction(split[0]); //split the first operand into 3 parts, :whole, numerator, and denominator
       int[] operand2 = parsingFraction(split[2]);
       if (split[0].indexOf("_") >= 0 && operand1[0] >= 0){
        improperFraction1 = Calculate.toImproperFrac(operand1[0], operand1[1], operand1[2]);
        String [] num = improperFraction1.split("/");
        for(int i = 0; i < 2; i++){
       		splitFraction1[i]= Integer.parseInt(num[i]);
       }
       }else if(split[0].indexOf("_") >= 0 && operand1[0] < 0){
    	   improperFraction1 = Calculate.toImproperFrac(operand1[0], -operand1[1], operand1[2]);
    	   String [] num = improperFraction1.split("/");
    	   for(int i = 0; i< 2; i++){
    		   splitFraction1[i]= Integer.parseInt(num[i]);
    		   System.out.println(splitFraction1[0] + "/" + splitFraction1[1]);
    	   }
       }else if(split[0].indexOf("/") >= 0){ 
    	   String [] num = split[0].split("/");
           for(int i = 0; i < 2; i++){
          		splitFraction1[i]= Integer.parseInt(num[i]);
           }
           }else{ 
        	   splitFraction1[0] = operand1[0];
        	   splitFraction1[1] = 1;
       }       
       if (split[2].indexOf("_") >= 0 && operand2[0] >= 0){
       improperFraction2 = Calculate.toImproperFrac(operand2[0], operand2[1], operand2[2]);
       String [] num1 = improperFraction2.split("/");
       for(int i = 0; i < 2; i++){
      		splitFraction2[i]= Integer.parseInt(num1[i]);
      }
       }else if(split[2].indexOf("_") >= 0 && operand2[0] < 0){
    	  improperFraction2 = Calculate.toImproperFrac(operand2[0], -operand2[1], operand2[2]);
   	   String [] num1 = improperFraction2.split("/");
   	   for(int i = 0; i< 2; i++){
   		   splitFraction2[i]= Integer.parseInt(num1[i]);
   		   System.out.println(splitFraction2[0] + "/" + splitFraction2[1]);
      }
      }else if(split[2].indexOf("/") >= 1){ 
   	   String [] num1 = split[2].split("/");
          for(int i = 0; i < 2; i++){
         		splitFraction2[i]= Integer.parseInt(num1[i]);
          }
          }else{ 
       	   splitFraction2[0] = operand2[0];
       	   splitFraction2[1] = 1;
          }      
       String operator = split[1].toString(); //Select the correct method by checking the operator
       if (operator.equals("+") == true){
    	   answer = add(splitFraction1, splitFraction2);
       }else if(operator.equals("-") == true){
    	   answer = subtract(splitFraction1, splitFraction2);  
       }else if(operator.equals("*") == true){
    	   answer = multiplication(splitFraction1, splitFraction2);
       }else if(operator.equals("/") == true){
    	   answer = division(splitFraction1, splitFraction2);
       }
       return answer;
   }
   public static int[] parsingFraction(String operand){
   	String [] part= new String[3];
   	if(operand.indexOf("_") == -1 && operand.indexOf("/") == -1){ //this is for whole number
   		part[0]=operand; 
   		part[1]="0";
   		part[2]="1";
   	} else if(operand.indexOf("_")>=1){ //this is for mixed fraction
   			part[0]= operand.substring(0, operand.indexOf("_"));
   			operand = operand.substring (operand.indexOf("_")+1);
   		} else { //for rest of the fractions
   			part[0]="0";
   		}
   		if (operand.indexOf("/")>=1){ //split the fraction
   			part[1]= operand.substring(0, operand.indexOf("/"));
   			part[2]= operand.substring( operand.indexOf("/")+1);
   		}
   	int[] number=new int [3]; //Converting String into int
   	for(int i = 0; i < 3; i++){
   		number [i]= Integer.parseInt(part[i]);
   	} 
   	return number;	
   }
public static String add(int [] splitFraction1, int [] splitFraction2){ //This method can help you to find the sum of fractions
	int firstNumerator = splitFraction1[0];
	int firstDenominator = splitFraction1[1];
	System.out.println(firstNumerator + "/" + firstDenominator);
	int secondNumerator = splitFraction2[0];
	int secondDenominator = splitFraction2[1];
	System.out.println(secondNumerator + "/" + secondDenominator);
	int gcf= firstDenominator * secondDenominator;
	System.out.println(gcf);
	int sumNumerator = ((gcf/firstDenominator) * firstNumerator) + ((gcf/secondDenominator) * secondNumerator);
	String answer = sumNumerator + "/" + gcf;
	return answer;
}
public static String subtract(int [] splitFraction1, int [] splitFraction2){ //This method can help you to find the difference of fractions
	int firstNumerator = splitFraction1[0];
	int firstDenominator = splitFraction1[1];
	System.out.println(firstNumerator + "/" + firstDenominator);
	int secondNumerator = splitFraction2[0];
	int secondDenominator = splitFraction2[1];
	System.out.println(secondNumerator + "/" + secondDenominator);
	int gcf= firstDenominator * secondDenominator;
	int diffNumerator = ((gcf/firstDenominator) * firstNumerator) - ((gcf/secondDenominator) * secondNumerator);
	String answer = diffNumerator + "/" + gcf;
	return answer;
}
public static String multiplication (int [] splitFraction1 , int [] splitFraction2){ //This method helps you to find out the product of two fractions
	int firstNumerator = splitFraction1[0];
	int firstDenominator = splitFraction1[1];
	System.out.println(firstNumerator + "/" + firstDenominator);
	int secondNumerator = splitFraction2[0];
	int secondDenominator = splitFraction2[1];
	System.out.println(secondNumerator + "/" + secondDenominator);
	String answer = (firstNumerator * secondNumerator) + "/" + (firstDenominator * secondDenominator);
	return answer;
}
public static String division (int [] splitFraction1, int [] splitFraction2){ //This method helps you to find out the division of two fractions
	int firstNumerator = splitFraction1[0];
	int firstDenominator = splitFraction1[1];
	System.out.println(firstNumerator + "/" + firstDenominator);
	int secondNumerator = splitFraction2[1];
	int secondDenominator = splitFraction2[0];
	System.out.println(secondNumerator + "/" + secondDenominator);
	String answer = (firstNumerator * secondNumerator) + "/" + (firstDenominator * secondDenominator);
	return answer;
}
}
  