package fr.emse.helloWorld;

public class HelloWorld {

private String message;

public HelloWorld(String message) {
	this.message=message;
}

public String getMessage() {
	return this.message;
}

public static void main(String[] args){
   	HelloWorld h = new HelloWorld("Bonjour");
	System.out.println(h.getMessage());
}

}