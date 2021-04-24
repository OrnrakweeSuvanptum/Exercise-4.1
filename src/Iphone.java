import java.util.Scanner;
public class Iphone extends Handphone {
	
	Scanner s = new Scanner(System.in);
	private String brand, operatingSystem, SIM;
	private int RAM, storage;
	private double length, discount, afterDiscount;
 	
	Iphone(){
		
		this.brand = "IPHONE";
		System.out.print("Please enter length of handphone(mm): ");
		this.length = s.nextDouble();
		super.getThickness();
		super.getWidth();
		
		System.out.print("Please enter the operating system: ");
		this.operatingSystem = s.next();
		System.out.print("Please enter SIM type: ");
		this.SIM = s.next();
		System.out.print("Please enter RAM: ");
		this.RAM = s.nextInt();
		System.out.print("Please enter storage: ");
		this.storage = s.nextInt();
		
	}
	
	public double calDiscount() {
		System.out.print("Enter discount(%): ");
		discount = s.nextDouble();
		discount= (discount/100)*super.totalAmount();
		return discount;
	}
	
	public double afterDiscount() {
		afterDiscount = super.totalAmount()-calDiscount();
		return this.afterDiscount;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getOperatingSystem() {
		return this.operatingSystem;
	}
	
	public String getSIM() {
		return this.SIM;
	}
	
	public Integer getRAM() {
		return this.RAM;
	}
	
	public Integer getStorage() {
		return this.storage;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double dimension() {
		return super.area()*length;
	}
	
}
