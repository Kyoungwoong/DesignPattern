public class Singleton {
    private static Singleton singleton; // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 전역변수

    private Singleton() {} // 생성자를 private로 선언했으므 Singleton 클래스에서만 생성자 생성 가능

    public static Singleton getInstance() { // instance 호출
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
