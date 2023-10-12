package prac;

public class Circle {
	private final double PI=3.14;
	
	public int radius;
	public String name;
	public Circle(Circle c) {
		this.radius = c.radius;
		this.name=new String(c.name);
		
	}
	public Circle(int r,String n){
		this.initialize(r,n);
		
	}
	
	public void initialize(int r,String n) {
		this.radius=r;
		this.name=n;
	}
	
	public void setRadius (int radius) {
		this.radius =radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

	public double getPI() {
		return this.PI;
		
	}public double getArea() {
		return PI*radius*radius;
		
	}
	
	
	
	
	public String toString() {
		return "name : "+ getName()+"radius : "+getRadius();
	}
	public static void main(String[] args) {
		System.out.println("Class and Objext Practice");
		
		Circle pizza = new Circle(15,"Hawaiian pizza");
		System.out.println(pizza.toString());
		
		Circle pizzaCopy=new Circle(pizza);	
		System.out.println(pizzaCopy.toString());
		
		
		
		
	}
}
