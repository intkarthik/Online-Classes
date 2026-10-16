package Multilevel_Inheritance;

public class Whatsapp_Version_1 {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println(this.message);
	}

	public void sendMessage() {
		System.out.println("Message sent");
	}
}
