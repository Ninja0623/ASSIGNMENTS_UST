package encapsulation;

public class Mobile {
	
	private String brand;
	private int price;
	
	

	public String getBrand() {
		return brand;
	}


	public String getPrice() {
		return "Price : "+price+", "+"GST : "+price*0.18;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setPrice(int price) {
		this.price = price;
	}



	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		m.setBrand("RealMe");
		m.setPrice(25000);
		System.out.println(m.getPrice());
	}

}
