package interviewPractice;

public class IntreviewCoding {
	
	public static void main(String[] args) {
		String reversedString = reverseString("I like coding!");
		System.out.println(reversedString);
		
		fizzBuzz(300);
		
		swapTwoNumber(11, 21);
	}
	
	
	
	
//	FizzBuzz (300 numbers)   
//	if a number can be divided by 5, print this number with Fizz, 
//	if a number can be divided by 4, print this number with Buzz. 
//	if a number can be divided by 4 & 5, then print this number with FizzBuzz,  
	
	// number % 5 ==0
	// number % 4 ==0
	// number %4 && number %5, fizzBuzz
	// 20
	
	public static void fizzBuzz(int limit) {
		
		for(int i=1; i<=limit;i++) {
			
			if(i%5==0&& i%4==0) {
				System.out.println("This number "+i+" is FizzBuzz");
			}else if(i%4==0) {
				System.out.println("This number "+i+" is Buzz");
			}else if(i%5==0 ) {
				System.out.println("This number "+i+" is Fizz");
			}
		}
	}
	

	//How to reverse a number by only using 2 variables? (Only use given variable and target variable)
	public static void swapTwoNumber(int a, int b) {
		
		System.out.println("The old value of a: "+a+"   b: "+b);

		
		a = a+b;  
		b = a-b;  // a+b -b  -> a
		a = a-b;  // a+b -a  -> b
		
		System.out.println("The new value of a: "+a+"   b: "+b);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//How do you reverse a String?
	public static String reverseString(String s) {
		String result = "";
		
		String[] ss = s.split("");
		for(int i=s.length()-1; i>=0;i--) {
			result += ss[i];
		}
		
		return result;
	}
	
	
	

}
