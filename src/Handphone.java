import java.util.Scanner;
public class Handphone {
	Scanner s = new Scanner(System.in);
	private double size, thickness, width, price;
	private int weight, quantity; 
	
	Handphone(){
		System.out.print("Please enter size of handphone(inches): ");
		this.size = s.nextDouble();
		System.out.print("Please enter thickness of handphone(mm): ");
		this.thickness = s.nextDouble();
		System.out.print("Please enter width of handphone(mm): ");
		this.width = s.nextDouble();
		System.out.print("Please enter weight of handphone(gram): ");
		this.weight = s.nextInt();
		System.out.print("Please enter price of handphone: ");
		this.price = s.nextDouble();
		System.out.print("Please enter quantity: ");
		this.quantity = s.nextInt();
	}
	public double getSize() {
		return this.size;
	}
	
	public double getThickness(){
		return this.thickness;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double area() {
		return width*thickness;
	}
	
	public Integer getWeight(){
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}
	public double totalAmount() {
		return this.price*this.quantity;
	}

}
