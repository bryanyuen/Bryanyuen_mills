package snippet;

public class Snippet {
	public static String quadForm(int a, int b, int c){
			String answer = "";
			double x1;//the positive solution
			double x2;//the negative solution
			double x3;//round the positive solution by using Calculate.round2 method
			double x4;//round the negative solution by using Calculate.round2 method
			if(Calculate.discriminant(a, b, c) == 0){
				x1 = ((-b+Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
				x3 = Calculate.round2(x1);
				answer = String.valueOf(x3);
			}else if(Calculate.discriminant(a, b, c) < 0){
				answer = "no real roots";
			}else if(Calculate.discriminant(a, b, c) > 0){
				x2 = ((-b-Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
				x4 = Calculate.round2(x2);
				x1 = ((-b+Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
				x3 = Calculate.round2(x1);
				if(x3>x4){
					answer = String.valueOf(x4) + " and " + String.valueOf(x3);
				}else{
					answer = String.valueOf(x3) + " and " + String.valueOf(x4);
				}
			}
			return answer;
			
			
		}
	
}

