package pf.com;

public class HelloTest {

	public static void main(String[] args) {

		
		HelloService hh = new HelloService();
		Hello hello = hh.getHelloPort();
		System.out.println(hello.bonjour("Franz"));

		
	}

}
