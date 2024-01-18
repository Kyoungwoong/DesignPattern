# Singleton Pattern

## 사용이유

---

- 하나만 있어도 충분히 돌아가는 객체에 사용
    - 스레드 풀, 캐시, 로그 기록용 객체…
- 이러한 객체가 두개이상있으면
    - 프로그램이 이상하게 돌아갈 가능성.
    - 자원을 불필요하게 사용.
    - 결과에 일관성이 없어질 수 있음.
- 정적 클래스와 메소드의 접근 변경자를 잘 다룰 줄 알아야함

### 전역변수

- 싱글톤 패턴과 비슷.
- 단점
    - 객체를 한번도 쓰지 않는다면 괜히 자원만 잡아 먹을 수 있음.
- 싱글톤 패턴은 필요할 때만 객체를 생성 가능.

## 고전적인 싱글턴

---

```java
public class Singleton {
    private static Singleton singleton; // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적변수

    private Singleton() {} // 생성자를 private로 선언했으므 Singleton 클래스에서만 생성자 생성 가능
    
    public static Singleton getInstance() { // instance 호출
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```

- `singleton` 은 클래스의 하나뿐인 정적변수
- 인스턴스가 필요한 상황 전까지 인스턴스를 만들지 않고 필요할 때 인스턴스를 생성. ⇒ **Lazy instantiation**
- 유일한 객체
- public으로 지정된 생성자가 없음.
- `getInstance()` 정적 메서드 존재. 정적 인스턴스 호출

## 싱글턴 패턴

---

💡 **싱글턴 패턴**
클래스 인스턴스를 하나만 만들고 그 인스턴스로의 전역 접근을 제공.

### 문제

- 멀티 스레딩에서의 문제가 생김.
- 두가지의 스레드에서 다른 객체가 생김.
- 이를 해결하기 위해서는
    - `synchronized` 키워드 사용
        - `synchronized` 키워드만 추가하면 한 스레드가 메소드 사용을 끝나기 전까지 다른 스레드는 기다려야함.
        - 속도 문제가 생길 수 있음
    - 선언시 인스턴스 생성
    - `voliate` 키워드 사용
        - 인스턴스가 있는지 확인 후 동기화 블록에 들어감
        - `synchronized` 내부의 블록에 한번 더 체크 하므로 동기화

## 고찰

---

- 클래스 로더마다 서로 다른 네임스페이스 정의하기때문에 클래스 로더가 두개 이상이면 같은 클래스 여러번 로딩하기에 객체가 두개 이상 생길 수 있음.
- 리플랙션, 직렬화, 역직렬화에서 문제가 생길 수 있음. ⇒ 체크하면서 개발해야함.
- 싱글턴은 느슨한 결합 원칙에 위배됨.
- 클래스는 기본적으로 하나의 책임만 져야함. 하지만 싱글턴은
    - 하나의 클래스가 자신의 인스턴스를 관리하는 일
    - 인스턴스를 사용하는 목적.
    - 이 두가지 책임을 가짐.