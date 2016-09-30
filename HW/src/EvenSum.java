import java.util.*;
public class EvenSum {
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.println("Give me 8 integers");
		int min = 100000000;
		int max = 0;
		int evenTotal = 0;
		for (int i = 0; i<8; i++){
			int inputNumber = userInput.nextInt();
			if(inputNumber%2 == 0){
				evenTotal += inputNumber;
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
		System.out.println("Even total is " + evenTotal);;
	}

}

