package 생성자;

public class 키보드 {
	int price;
	int count;
	String brand;
	
	public 키보드(int p, int c) {
		price = p;
		count = c;
	}
	public 키보드(int p, String b , int c) {
		price = p;
		count = c;
		brand = b;
	}
	@Override
	public String toString() {
		return "키보드 [price=" + price + ", count=" + count + ", brand=" + brand + "]";
	}
	
}
