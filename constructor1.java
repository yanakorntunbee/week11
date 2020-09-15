package week11;

public class constructor1{
	int age=5;
	String size;
	String breed="Thailand";
	   		
		public constructor1(){
	   			System.out.println("My cat is a "+age);
	   			System.out.println("My cat is breed "+breed);
	   }
	   		
	   		void method1() {
	   		System.out.println("My Cat is size = " + size);	
		   
	   }
	   		void method2() {
		   
	   }
	   
	   		public static void main(String[]args) {
	   		String size="Big";
	   			constructor1 cat1 = new constructor1();
	   			constructor1 cat2 = new constructor1();
	   			cat2.size="small";
	   			cat2.method1();
	   		
	}
}