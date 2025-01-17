//Name : Bryan Yuen
//Period : 2nd
//Date : 9/30
//Function : This program is used to print out the largest(max) and the smallest(min) user input
//			and print out the sum of even numbers that user typed and the largest even number.
import java.util.*;
public class EvenSum {
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.println("How many integers do you have ? ");
		int times = userInput.nextInt();
		System.out.println("Type your integers here!!!");
		int min = 100000000;
		int max = 0;
		int maxEven = 0;
		int evenTotal = 0;
		for (int i = 0; i<times; i++){
			int inputNumber = userInput.nextInt();
			if(inputNumber%2 == 0){
				evenTotal += inputNumber;
				if(inputNumber > maxEven){
					maxEven = inputNumber;
				}
			}
			
			if(inputNumber > max){
				max = inputNumber;
			}
			if(inputNumber < min){
				min = inputNumber;
			}
		}
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
		System.out.println("The largest even number is " + maxEven);
		System.out.println("Even total is " + evenTotal);;
	}

}

