package dio.gof.singleton;
/**
 * Singleton "apressado"
 * @author RafaelMSantana
 * */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
