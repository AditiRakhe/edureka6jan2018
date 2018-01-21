class WhatsAppUser{
	
	String status; // Belongs to Object
	
	static String title; // Belongs to Class
	
	void show(){
		System.out.println("status: "+status+" | title: "+title);
	}
}

public class StaticDemoAgain {

	public static void main(String[] args) {
		
		WhatsAppUser john = new WhatsAppUser();
		WhatsAppUser jennie = new WhatsAppUser();		
		WhatsAppUser jim = new WhatsAppUser();
		
		john.status = "Be Exceptional !!";
		jennie.status = "Work Hard !!";
		jim.status = "Believe in Yourself !!";
		
		WhatsAppUser.title = "Edureka";
		
		jennie.title = "Edureka LMS";
		
		john.show();
		jennie.show();
		jim.show();

	}

}
