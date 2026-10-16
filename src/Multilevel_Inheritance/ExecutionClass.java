package Multilevel_Inheritance;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whatsapp_Version_3 whatsappVersion_3 = new Whatsapp_Version_3();
		whatsappVersion_3.sendMessage();
		whatsappVersion_3.voiceCall();
		whatsappVersion_3.videoCall();
		whatsappVersion_3.status();
		whatsappVersion_3.payment();
		whatsappVersion_3.setMessage("Hello");
		//System.out.println(whatsappVersion_3.getMessage());
	}

}
