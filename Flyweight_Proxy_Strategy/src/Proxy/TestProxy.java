package Proxy;

public class TestProxy {

	public static void main(String[] args) {


		InterfataLogin login=new ModulLogin("10.0.0.1");
		if(login.login("admin", "root1234"))
			System.out.println("hayyy");
		else 
			System.out.println("wrong pass");
		
		//adaugam proxy
		login=new ProxyLogin(login);
		
		
		String[] parole=
				new String[] {"1234","root","admin","root12","root1234"};
		for(String parola:parole) {
			if(login.login("admin", parola))
				System.out.println("am gasit parola"+ parola);
		}
		
		System.out.println("game over");
		

	}

}
