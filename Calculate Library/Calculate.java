/*Kaitlyn Endo 
September 5, 2017
this is our home ground library that will contain various mathematical method 
*/

	//square the Input
public class Calculate {
		public static int square (int operand) {
			return operand * operand;}
		

		//Cube takes in an integer and return the integer cubed
		public static int cube (int operand) {
			return operand * operand * operand;}
		
		//takes in two doubles and returns their average
		public static double average (double operand, double number) {
			return (operand + number) /2;}
		
		//takes in three doubles and returns their average
		public static double average (double inputnumber1, double inputnumber2, double inputnumber3) {
			return (inputnumber1 + inputnumber2 + inputnumber3) /3;}
		
		//Converts an angle measure given in radians into degrees. 
		//Accepts a double and returns a double
		public static double toDegrees (double operand) {
			return (operand*180/3.14159);}
		
		//accepts a double and returns a double 
			//Converts an angle measure given in radians into degrees
			public static double toRadians (double operand) {
				return (operand*3.14159/180);}
			
		//Provides a coefficient of a quadratic equation in standard form (a, b, and c)
		//accepts a three doubles and returns a double
			public static double discriminant (double a, double b, double c) {
				return 
						
		//converts mixed number into an improper fraction
		//accepts three integers adn returns a string 
			public static int toImproperFrac (int operand) {
				return 
						
		//converts an improper fraction into a mixed number
		//accepts two integers and returns a string
			public static int toMixedNum (int operand) {
				return to MixedNum "3_1/2";}
		 
		//converts a binomial multiplication of the form (ax+b)(cx+d)
		//into a quadratic equation of the form ax^2+ bx + c.
		public static String foil (int a, int b, int c, int d, String n) {
			return(a*c)+n+"^2"+"+"+(a*d+b*c)+n+(b*d);
		}
		
		
		//Determines  whether or not one integer is evenly divisible by another 
		public static boolean isDivisibleBy (int number1, int number2) {
			if(number1 % number2 == 0); {
				return true;}
		}
		
		
		//Returns the absolue value of the number passed 
		public static double adsValue (double num) {
			if (num>= 0) 
				return num;
		        return num-num-num;}
		
		
		
		//Returns the larger of the double passed 
		public static double max (double a, double b) {
			if(a <= b)
				return (a);
			if (a <= b);
			return (b); }
		
		//Accepts three doubles and returns the largest double 
		public static double max (double numbera, double numberb, double numberc) {
			if ((numbera > numberb) && (numbera > numberc))
				return (numbera);
			if (numberb > numbera && numberb > numberc)
				return (numberb);
			    return numberc;
		}
		
		
		//Returns the smaller value of the integers passed 
		public static int min (int num, int numb) {
			if (num>=numb)
				return numb;
			    return num;
		}
		
		
		//Rounds a double correctly to 2 decimal places and returns a double 
		public static double round2 (double orig) {
			double result = 0.0;
			int tempInt = (int) (orig * 1000);
			int roundNum = tempInt % 10;
			tempInt = tempInt /10;
			if ( roundNum >= 5 && tempInt < 0)
					tempInt ++;
			else if (roundNum <= -5 && tempInt <0)
					tempInt --;
			result = tempInt /100.0;
			return result;
		}
		
		
		//Raise a value to a positive integer power
		public static double exopnent (double a, int power) {
		     //return Math.pow (a,i);
			
			for(int i =0; i<=power; i++);
			 return (a*i);
		}
			
		//Factorial returns the factorial of the value passed 
		public static int factorial (int number) {
			if (number == 0) {
				return 1;
			}
			int fct = 1; // this will be the result
			for (int i = 1; i<= number; i++) {
				fact *= i;
			}
			return fact;
			
		 }
		
		
		//isPrime determines whether or not an integer is prime
			public static boolean isPrime (int number) {
					int sqrt = (int) Math.sqrt(number) + 1;
					for (int i =2; i < sqrt; i++)
							if (number % i == 0) {
									// number is perfectly divisible - no prime return false 
									return false;
							}else {
							return true;}
					}
	       
		   }
		
				
		//Finds the greatest common factor of two integers
		public static int gcf (int operanda, int operandb) {
			for(int i =1; i <= operanda && i <= operandb; ++i)
				// Checks if i is factor of fboth integers 
				if (operanda  % i ==0 &&  i ==0)
					return i;
			}
		
		//sqrt returns an approximation of the square root of the value passed 
	    //rounds to two decimal places
		public static double sqrt (double number) {
			if (number< 0) {
					throw new IllegalArgumentException();
			}else {
			double guess =0;
			double sqrt =0.1;
				while 
			}
			
		}
		
		public static int quadform ()
		
				
				
		
		
		
			
			
	

	
	
 
				