package week3.day1;

public class Calculator {
	
	
	public void addition(int a,int b) {
		
		int sum1 = a+b;
		
		System.out.println("Sum of a an b is:" +sum1);
			
	}
	
	
    public void addition(int c,int d,int e) {
		
		int sum2 = c+d+e;
		
		System.out.println("Sum of c,d and e is:" +sum2);
			
	}
	
    
     public void multiply(int f,int g) {
		
		int mul1 = f*g;
		
		System.out.println("multiplication  of f and g is:" +mul1);
			
	}
	
     public void multiply(int h, double i) {
 		
 	 double mul2 = h*i;
 		
 		System.out.println("multiplication of h an i is:" +mul2);
 			
 	}
     
     
     
     public void subtraction(int j,int k) {
 		
 		int sub1 = j-k;
 		
 		System.out.println("Sub of j and k is:" +sub1);
 			
 	}
 	
	
     public void subtraction(double l,double m) {
  		
  		double sub2 = l-m;
  		
  		System.out.println("Sub of l and m is:" +sub2);
  			
  	}
     
     public void divide(int n,int o) {
  		
  		int div1 = n/o;
  		
  		System.out.println("Div of n by o is:" +div1);
  			
  	}
     
     public void divide(double p,int q) {
   		
   		double div2 = p/q;
   		
   		System.out.println("Div of p by q is:" +div2);
   			
   	}
      
     
	public static void main(String[] args) {
		

		Calculator cal = new Calculator();
		
		cal.addition(10,20);
		
		cal.addition(10,20,30);
		
		cal.multiply(100,200);
		
		cal.multiply(20, 2.5);
		
		cal.subtraction(40, 20);
		
		cal.subtraction(20.5, 10.5);
		
		cal.divide(400, 2);
		
		cal.divide(20.4, 2);
		

	}

}
