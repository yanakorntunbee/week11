package week11;

public class student2{
	int Number1, Number2;
	String name;
	
	student2(){
		super();
		System.out.println("IU");
	}
	
	student2(int num1,int num2,String name1){
		this.Number1=num1;
		this.Number2=num2;
		this.name=name1;
	}
	public static void main(String[]args) {
		student2 st2 = new student2(20,50,"Mark");
		student2 st1 = new student2();
		System.out.println(st2.Number1);
		System.out.println(st2.Number2);
		System.out.println(st2.name);
	}
}