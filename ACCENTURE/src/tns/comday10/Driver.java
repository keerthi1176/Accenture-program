package tns.comday10;

public class Driver {
	

		public static void main(String[] args) {
		
			int n= 15;
			int a[] ;  // declaration
		a= new int[n];
		
		//display the array 
		Arrayoperation.printArray(a);
		
		//assigning the values in array a
		for(int i=0; i<a.length; i++)
			a[i] = 5 *i ;
		
		Arrayoperation.printArray(a);
		
		int b[] = { 10, 20, 30 ,40 ,50} ; //initialization at the time of declaration
		Arrayoperation.printArray(b);
		
		
		//calling variable argument function
		System.out.println("sum of array elements is : " + Arrayoperation.getSum(b));
		System.out.println("sum of array elements is : " + Arrayoperation.getSum(10, 20));
		
		b[4] = 999; // assigning  single element
		Arrayoperation.printArray(b);
		
		//Display total no of odd and even numbers in array b
		
		System.out.println(" Odd numbers:"  + Arrayoperation.getOddCount(b)  + "\t Even numbers : "+Arrayoperation.getEvenCount(b)  );
		System.out.println();
		System.out.println("  ......................");
	}
	
}
