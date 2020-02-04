package 스태틱;

public class Mouse {
	String color;
	String company;
	int price;
	
	public Mouse(String color, String company, int price) {
		this.color = color;
		this.company = company;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mouse [color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	

}
