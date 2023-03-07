package fr.emse.helloWorld;
import java.util.Vector;

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
private Vector<String> listMessage;

/**
   * Le constructeur de la classe HelloWorld
   *
   * @param message Les messages a afficher
   */
public HelloWorld(Vector<String> listMessage) {
	this.listMessage = listMessage;
}

   /**
   * Cette methode renvoie une chaine de caracteres contenant le message
   *
   * @return Une chaine de caractere contenant le message
   */
public String getMessage() {
	return this.message;
}

public Vector<String> getListMessage() {
	return this.listMessage;
}

/**
   * Cette methode affiche le message dans la console
   */
public static void main(String[] args){
	Vector<String> vector = new Vector();
	vector.add("Bonjour");
	vector.add("Holla");
	vector.add("Bonjorno");
   	HelloWorld h = new HelloWorld(vector);
	System.out.println(h.getListMessage());
}

}