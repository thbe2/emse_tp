package fr.emse.helloWorld;

/**
 * Cette classe est un test.
 *
 * @author Theo Besson
 */
public class HelloWorld {

/**
   * Le message à afficher
   */
private String message;

/**
   * Le constructeur de la classe HelloWorld
   *
   * @param message Le message a afficher
   */
public HelloWorld(String message) {
	this.message=message;
}

   /**
   * Cette methode renvoie une chaine de caracteres contenant le message
   *
   * @return Une chaine de caractere contenant le message
   */
public String getMessage() {
	return this.message;
}

/**
   * Cette methode affiche le message dans la console
   */
public static void main(String[] args){
   	HelloWorld h = new HelloWorld("Bonjour");
	System.out.println(h.getMessage());
}

}