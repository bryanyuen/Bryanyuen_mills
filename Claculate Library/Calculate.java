
public class Calculate {
	public static int square (int number){
		int answer;
		answer=number*number;
		return(answer);
	}

	public static int cube (int number){
		int answer;
		answer=number*number*number;
		return(answer);
	}
	public static int average(int number){
		int answer=(number+number)/2;
		return(answer);
	}
	public static double average(double number){
		double answer;
		answer=(number+number+number)/3;
		return(answer);
	}
	public static double toDegrees (double radian){
		double answer;
		answer=radian*(3.14159/180);
		return(answer);
	}
	public static double toRadians (double degree){
		double answer;
		answer=degree*(180/3.14159);
		return(answer);
	}
	public static discriminant (double abcValue){
		double aValue;
		double bValue;
		double cValue;
		double answer;
		answer= (bValue*bValue)+(-4*aValue*cValue);
		return(answer);
	}
	
}
