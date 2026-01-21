package polymorphism;

class Notification{
	void send() {
		System.out.println("Send");
	}
}

class Email extends Notification{
	void send() {
		System.out.println("Sent through Email");
	}
}

public class SMS extends Notification{

	void send() {
		System.out.println("Sent through SMS");
	}
	
	public static void main(String[] args) {
		Notification n=new Email();
		n.send();
		n=new SMS();
		n.send();
	}

}
