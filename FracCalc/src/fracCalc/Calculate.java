package fracCalc;
//Bryan Yuen
//2nd period 
//Project: Math Library
public class Calculate {
	//This program is used to square the integer.
	public static int square (int number){
		return(number*number);
	}
	//This program is used to cube the integer.
	public static int cube (int number){
		int answer;
		answer=number*number*number;
		return(answer);
	}
	//This program is used to find out the average of two doubles.
	public static double average(double number,double number2){
		double answer=(number+number2)/2;
		return(answer);
	}
	//This program is used to find out the average of three doubles.
	public static double average(double number, double number2, double number3){
		double answer;
		answer=(number+number2+number3)/3;
		return(answer);
	}
	//This program is used to convert degree to radian.
	public static double toDegrees (double radian){
		double answer;
		answer=radian*(180/3.14159);
		return(answer);
	}
	//This program is used to convert radian to degree.
	public static double toRadians (double degree){
		double answer;
		answer=degree*(3.14159/180);
		return(answer);
	}
	//This program can help you to find the discriminant of three doubles.
	public static double discriminant (double aValue,double bValue,double cValue){
		double answer;
		answer= (bValue*bValue)+(-4*aValue*cValue);
		return(answer);
	}
	//This program is used to convert mixed number to an improper fraction.
	public static String toImproperFrac (int wholenumber, int numerator, int denominator){
		String answer;
		answer= ((wholenumber*denominator)+numerator)+"/"+denominator;
		return(answer);
	}
	//This program is used to convert improper fraction to mixed number.
	public static String toMixedNum (int numerator, int denominator){
		String answer;
		if (denominator == 0){
			answer = "undefined";
		}else if(numerator == 0){
			answer = "0";
		}else if(numerator % denominator == 0){
			answer = "" + numerator/denominator; 
		}else{
			answer = ((numerator - (numerator % denominator))/denominator + "_" + (numerator%denominator)+"/"+denominator);
		}
		return answer;
	}
	//This program is used to convert a binomial multiplication form into a quadratic equation form.
	public static String foil (int a,int b, int c, int d,String character){
		String answer;
		if(b*d<0){
			int positiveC = (int)Calculate.absValue(b*d);
			answer = ((a*c) + character + "^2" + " + "+((a*d)+(b*c)) + character + " - " + positiveC);
		}else{
			answer = ((a*c) + character + "^2" + " + "+((a*d)+(b*c)) + character + " + " + b*d);
		}
		return answer;
	}
	//This program is used to determine whether or not one integer is evenly divisible by another.
	public static boolean isDivisibleBy (int a, int b){
		if(a%b==0){
			return true;
		}else{
			return false;
		}
	}
	//This program is used to return a number to the absolute value.
	public static double absValue (double a){
		if(a<0){
			return (a+(-a)+(-a));
		}else{
			return a;
		}
	}
	//This program is used to find out the largest integer from the inputs.
	public static int max (int a, int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	//This program is used to find out the largest double from the inputs.
	public static double max (double a, double b, double c){
		if(a>b && a>c){
			return a;
		}else if(b>a && b>c){
			return b;
		}else{
			return c;
		}
	}
	//This program is used to find out the smallest integer from the input.
	public static int min (int a, int b){
		if(a>b){
			return b;
		}else{
			return a;
		}
	}
	//This program is used to round a double to 2 decimal places.
	public static double round2 (double number){
		int b = (int)(number*100);
		double x;
		if ((b + 0.4) >= (number*100)){
			x = b/100.0;
			return x;
		}else{ x = (b+1)/100.0;
		return x;
		}
	}
	//This program is used to raise a value to a positive integer power.
	public static double exponent (double number, int exponent){
		double answer = 1;
		if(exponent > 0){
			for(int i = 1; i <= exponent; i++){
				answer *= number;
			}
		}else if(exponent == 0){
			answer = 1;
		}else if(exponent < 0){
			for(int j = exponent; j <= -1; j++){
				answer *= number;
			}
			answer = 1/answer;
		}
		return answer;
	}
	//This program is used to the factorial of the value passed.
	public static int factorial (int number){
		for (int i = number-1; i > 0; i--){
			number = number * i;
		}
		return number;
	}
	//This program is used to determine if the input number a prime number.
	public static boolean isPrime (int number){
		boolean check;
		if (number <= 1){
			return false;
		}
		for(int i= number-1; i>1; i--){
			check = Calculate.isDivisibleBy(number, i);
			if (check == true){
				return false;
			}
		}
		return true;
	}
	//This program is used to find out the greatest common factor of two integers.
	public static int gcf(int a, int b){
		while(a!=0 && b!=0){
			int c = b;
			b = a%b;
			a = c;
		}
		return (int) Calculate.absValue(a+b);
	}
	
	//This program helps you to squareroot a number. 
    public static double sqrt (double number){
    	double t;
    	double squareroot = number/2;
    	do{
    		t = squareroot;
    		squareroot = (t + (number/t))/2;
    	}while ((t - squareroot) !=0);
    	return squareroot;
    }
    //This program is used to check the discriminant to determine the number of roots and the exact value of the roots.
    public static String quadForm(int a, int b, int c){
		//calculate quadratic formula
		String answer = "";
		double discriminant = Calculate.discriminant(a, b, c);
		if (discriminant < 0){
			return ("no real roots");
		}
		double answer1 = ((-b) + Calculate.sqrt(discriminant)) / (2*a);
		double answer2 = ((-b) - Calculate.sqrt(discriminant)) / (2*a);
		if (answer1 == answer2){
			answer += answer1;
			return (answer);
		}else{
			answer = "\"" + Calculate.round2(answer1) + " and " + Calculate.round2(answer2) + "\"";
			return (answer);
		}
	}


}
    	

    
    		

