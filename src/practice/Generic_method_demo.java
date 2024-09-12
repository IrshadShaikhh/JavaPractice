package practice;


public class Generic_method_demo {

	public static <E> void printarray(E[] elements)
	{
		for(E ele : elements)
		{
			System.out.println(ele);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intArray[] = {1,2,3,4,5};
		String strArray[]= {"abc","syz","pqr"};
		
		printarray(intArray);
		printarray(strArray);
	}

}
