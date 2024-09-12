package practice;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unboxing
		 //example of unboxing Integer is wrapper class and int is primitive data types 
		
		Integer a=10;
		int b=10;
		System.out.println(a==b); 
		
		
		//Autoboxing
		//example of autobaxing 
		int primitivetype = 10;
		Integer wrappertype = primitivetype;
		
		System.out.println("primitivetype value "+primitivetype);
		System.out.println("wrappertype value "+wrappertype);
		
		
		/*
		 * 
		 * 
		Integer x=1000;
		Integer y=1000;
		System.out.println(x==y);
		
		Integer e=100;
		Integer f=100;
		System.out.println(e==f);
		
		int p=10;
		int q=10;
		System.out.println(p==q);
		
		String str1="irshad";
		String str2="irshad";
		System.out.println(str1.equals(str2));
		
		*/
		double d=10.2;
		int b1=(int)a;
		System.out.println(b);
	}

}
