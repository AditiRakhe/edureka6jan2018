class Login{
	void loginUser(){
		System.out.println("Login User");
	}
}

class FaceBookLogin extends Login{
	void loginUser(){
		System.out.println("Login User with Facebook");
	}
}

class GoogleLogin extends Login{
	void loginUser(){
		System.out.println("Login User with Google");
	}
}

class EmailLogin extends Login{
	void loginUser(){
		System.out.println("Login User with Email");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		Login login;
		
		login = new FaceBookLogin(); // Parent's reference variable is pointing to the object of child
		login.loginUser();
		
		login = new GoogleLogin();
		login.loginUser();
		
		login = new EmailLogin();
		login.loginUser();
				
		
	}

}
