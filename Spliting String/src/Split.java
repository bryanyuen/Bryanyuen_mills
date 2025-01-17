//Bryan Yuen 
//2nd period 
//Splitting string
import java.util.Arrays;

public class Split {
//if input contains space, use sandwichMaker
//if input contains no space, use sandwichNoSpace
	public static void main(String[] args) {
		String sandwich = "bread addasd bread";
		String answer = sandwichMaker(sandwich);
		System.out.println(answer.toString());
			//String.split();
			//It's a method that acts on a string, <StringName>.split(<String sp>);
			//Where sp is the string where the string splits
			//And it returns an array
			// Example: "I like apples!".split(" "); 
			//		it will split at spaces and return an array of ["I","like","apples!"]
			// Example 2: "I really like really red apples"split("really")
			//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
			
			//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
			
			
			//Your task:
			/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
			 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
			 * What if it's a fancy sandwich with multiple pieces of bread?
			*/
			//task 1
	}
		public static String sandwichNoSpace (String sandwich){
			int first = sandwich.indexOf("bread");
			int second = sandwich.indexOf("bread" , first +4);
			if (second > 0){
			String realSandwich = sandwich.substring(first+5, second);
			if (realSandwich.length() > 1){
			String [] realSandwich1 = realSandwich.split(" ");
			String newSandwich1 = Arrays.toString(realSandwich1);
			sandwich = newSandwich1;
			}
			else if (realSandwich.length() < 1){
				sandwich = "It is not a sandwich!!!!";
			}
			}else{ 
				sandwich = "It is not a sandwich!!!!";
			}
			return sandwich;
		}
		
			//String sandwich = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
			//String [] split = sandwich.split("bread");
			//String part1 = split[0];
			//String part2 = split[1];
			//String part3 = split[2];
			//System.out.println(Arrays.toString(split));
			//number of parts depends on the number of the separator in the string. 
			
			
			
			//Your task pt 2:
			/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
			 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
			 * Again, what if it's a fancy sandwich with multiple pieces of bread?
			*/
			//task2
	public static String sandwichMaker (String sandwich){
		int first = sandwich.indexOf("bread");
		int second = sandwich.indexOf("bread" , first +5);
		if (second > 0){
		String realSandwich = sandwich.substring(first+6, second);
		if (realSandwich.length() > 1){
		String [] realSandwich1 = realSandwich.split(" ");
		String newSandwich1 = Arrays.toString(realSandwich1);
		sandwich = newSandwich1;
		}
		else if (realSandwich.length() < 1){
			sandwich = "It is not a sandwich!!!!";
		}
		}else{ 
			sandwich = "It is not a sandwich!!!!";
		}
		return sandwich;
	}

	
}
