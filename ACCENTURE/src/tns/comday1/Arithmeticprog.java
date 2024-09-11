package tns.comday1;

public class Arithmeticprog {

	public static void main(String[] args) {

              int a = 13;
              int b= 24;
              int c= 33;
              int d= 45;
              
              a++;//13
              
              int e = a++ + b + c + d++; 
              
              System.out.println("value of e" + e);
           
              int f = --a + ++b + c + d; 
              System.out.println("value of f" + f);

	}
        
}


