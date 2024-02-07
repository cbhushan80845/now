package superExample;
class Chandra{
	Chandra(){
		System.out.println("Chandra bhushan is super class constructor");
	}
	public void developer() {
		System.out.println("Developer is common is both ");
	}
	public void javaDeveloper() {
		System.out.println("chandra bhushan is java dveloper");
		
	}

}
class Amit extends Chandra {
	
	Amit(){
		
		System.out.println("Amit is child class Constructor");
	}
	public void pythonDeveloper() {
		
		System.out.println("Amit is a python Developer");
	}
	
	void display() {
		pythonDeveloper();
		super.developer();
	}
	
	


}
public class ExampleSuper {
	public static void main(String[] args) {
	Amit c = new Amit();
	c.developer();
	c.javaDeveloper();
	c.pythonDeveloper();
	}
}
