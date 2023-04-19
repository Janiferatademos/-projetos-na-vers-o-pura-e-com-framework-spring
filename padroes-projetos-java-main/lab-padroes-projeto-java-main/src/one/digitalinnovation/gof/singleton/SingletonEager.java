package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 *
 */
public class SingletonEager {

	// Instancia atributo que precisa devolver
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
