package fracCalc;
import java.util.*;
public class FracCalc {



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
       int[] operand1= parsingFraction(split[0]);
       int[] operand2= parsingFraction(split[2]);
       String answer="whole:"+operand2[0]+" numerator:"+operand2[1]+" denominator:"+operand2[2];
       return answer;
   }
   public static int[] parsingFraction(String operand){
   	String[] part= new String[3];
   	if(operand.indexOf("_") == -1 && operand.indexOf("/") == -1){
   		part[0]=operand;
   		part[1]="0";
   		part[2]="1";
   	} else if(operand.indexOf("_")>=1){
   			part[0]= operand.substring(0, operand.indexOf("_"));
   			operand = operand.substring (operand.indexOf("_")+1);
   		} else {
   			part[0]="0";
   		}
   		if (operand.indexOf("/")>=1){
   			part[1]= operand.substring(0, operand.indexOf("/"));
   			part[2]= operand.substring( operand.indexOf("/")+1);
   		}
   	int[] number=new int [3];
   	for(int i = 0; i < 3; i++){
   		number [i]= Integer.parseInt(part[i]);
   	}
   	String improperFraction = Calculate.toImproperFrac(number[0], number[1], number[2]);
   	System.out.println(improperFraction);
   	return number;	
   }
}
