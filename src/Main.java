
public class Main {

	public static void main(String[] args) {
		
		Iphone I = new Iphone();
		System.out.println("Size: " + I.getSize() + "inches");
		System.out.println("Thickness: " + I.getThickness() + "mm");
		System.out.println("Weight: " + I.getWeight() + "g");
		System.out.println("Area of handphone: " + I.area());
		System.out.println("Dimension of handphone: " + I.dimension());
		System.out.println("Brand: " + I.getBrand());
		System.out.println("Operating System: " + I.getOperatingSystem());
		System.out.println("SIM type: " + I.getSIM());
		System.out.println("RAM: " + I.getRAM() + "gb");
		System.out.println("Storage: " + I.getStorage() + "gb");
		System.out.println("Price: RM" + I.getPrice());
		System.out.println("Quantity (unit): " + I.getQuantity());
		System.out.printf("Total amount: RM%.2f\n",I.totalAmount());
		System.out.printf("Discount: %.2f\n",I.calDiscount());
		System.out.printf("Total amount after discount: RM%.2f\n",I.afterDiscount());
		System.out.println();
		
		Oppo O = new Oppo();
		System.out.println("Size: " + O.getSize() + "inches");
		System.out.println("Thickness: " + O.getThickness() + "mm");
		System.out.println("Weight: " + O.getWeight() + "g");
		System.out.println("Area of handphone: " + O.area());
		System.out.println("Dimension of handphone: " + O.dimension());
		System.out.println("Brand: " + O.getBrand());
		System.out.println("Operating System: " + O.getOperatingSystem());
		System.out.println("SIM type: " + O.getSIM());
		System.out.println("Storage: " + O.getStorage() + "gb");
		System.out.println("RAM: " + O.getRAM() + "gb");
		System.out.println("Price: RM" + O.getPrice());
		System.out.println("Quantity (unit): " + O.getQuantity());
		System.out.printf("Total amount: RM%.2f\n",O.totalAmount());
		System.out.printf("Discount: %.2f\n",O.calDiscount());
		System.out.printf("Total amount after discount: RM%.2f\n",O.afterDiscount());
	
	}
}
