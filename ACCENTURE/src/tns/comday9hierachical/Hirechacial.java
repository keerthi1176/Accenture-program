package tns.comday9hierachical;


public class Hirechacial {
	

		public static void main(String[] args) {

			Person p ;
			
			p = new Student("keerthi","bangalore","77","ECE");
		
			 if (p instanceof Student)
			 System.out.println(p);
			 
			 p = new Employee("madhu","Bangalore","IT",10000000);
			 if( p instanceof Employee)
				 System.out.println(p);
			 
			 

		}

	}

