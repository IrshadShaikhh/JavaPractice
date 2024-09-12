package practice;

public class DataType_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  Implicit casting
		  
		byte to short,int,long,float , double
		short to int,long,float, double
		int to long, float, double
		long to float double
		float to double
		
		*/
		
		/*
		  Explicit casting
		  
		  double to float , long, int , short ,byte
		  float ot long int short byte
		  long to int short byte
		  int to short byte
		  short to byte
		 */
		
		byte a=10;
		double b=a;
		System.out.println(a+" "+b);
		
		short c =20;
		long d=c;
		System.out.println(c+" "+d);
		
		int s=10;
		long s1=10;
		System.out.println(s+" "+s1);
		
		double d1 = 30.40;
		int d2 = (int)(d1);
		System.out.println(d1+" "+d2);
		
		double d3 = 30.2;
	     float d4 = (float)d3;
	     System.out.println(d3+" "+d4);
	     
	     
	}

}
