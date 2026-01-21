package encapsulation;

public class Product {

	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>=100 && price<=100000)
			this.price = price;
	}

	public static void main(String[] args) {
		Product p=new Product();
		p.setPrice(3000);
		
	}

}
