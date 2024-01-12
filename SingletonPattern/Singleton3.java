public class Singleton3 {
    private volatile static Singleton3 uniqueSingleton;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (uniqueSingleton == null) {
            synchronized (Singleton3.class) {
                if (uniqueSingleton == null) {
                    uniqueSingleton = new Singleton3();
                }
            }
        }
        return uniqueSingleton;
    }
}
