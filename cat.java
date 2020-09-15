package week11;

public class cat{
	String Breed;
	String Size;
	String Color;
	String name;
	int Age;
				   public void print() {
					  System.out.println("Breed is : "+ Breed);
					  System.out.println("Color is : "+ Color);
					  System.out.println("Size  is : "+ Size);
					  System.out.println("Age   is : "+ Age+"\n");		
				}
				   public void name() {	
					   System.out.println("My cat name is "+name+"\n");
				}
	public static void main(String[]args) {
		cat cat1 = new cat ();
		cat cat2 = new cat ();
		cat cat3 = new cat ();
		cat1.Breed="[IU TV] 'dlwlrma.' Concert - Taipei Ep.1";
		cat1.Size="Small";
		cat1.Color="Red";
		cat1.Age=5;
		cat1.print();
		cat1.name="IU";
		cat1.name();
		
		cat2.Breed="[IU TV] 'dlwlrma.' Concert - Taipei Ep.2";
		cat2.Size="Big";
		cat2.Color="Blue";
		cat2.Age=3;
		cat2.print();
			
		cat3.Breed="BLACKPINK  (BLACKPINK HOUSE)’ EP.4-4";
		cat3.Size="Large";
		cat3.Color="Yellow";
		cat3.Age=1;
		cat3.print();
		
	}
}