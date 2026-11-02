package methodOverloading.login;

public class Driver {
public static void main(String[] args) {
	/*
	 * user can login using G-mail and other ways 
	 * multiple ways of implementing same operations that is login
	 */
	Login user = new Login();
	//user.doLogin(123);//compile time safety at compile time error 
	user.doLogin(839479384758l, "harsh");
	
}
}
