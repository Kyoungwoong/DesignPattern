# Adapter Pattern

## 객체지향 어댑터

---

- 새로운 클래스의 인터페이스가 기존 클래스의 인터페이스와 다를때
- 이를 적응시켜줄 클래스 ⇒ **Adapter**
    - 두 코드 모두 변화를 안가져도 됨.

## Adapter Pattern

---

- 클라이언트에서 타겟 인터페이스에게 `request()` 호출
- 어댑터는 타겟 인터페이스를 구현해 어뎁티 인스턴스의 메소드를 호출

<aside>
💡 주의
타겟 인터페이스의 크기에 따라 복잡해지지만 변경사항을 매번 고려해서 바꾸는 것보다는 **어댑터 패턴**을 구현하는 것이 효과적일 때가 있음.

</aside>

### **어댑터 패턴**

- 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환
- 호환되지 않던 인터페이스도 같이 사용할 수 있음.
- 특정 클라이언트가 구상 클래스에 의존하는 것이 아닌 **인터페이스에 의존**

## 객체 어댑터와 클래스 어댑터

---

**여태까지 구현했던 것이 객체 어댑터
클래스 어댑터를 구현하기 위해선 다중 상속이 필요**

- **객체 어댑터**
    - 구성 사용
    - 어댑티 클래스와 그 서브 클래스에 대해서 어댑터 역할 가능
    -
- **클래스 어댑터**
    - 특정 어댑티 클래스에만 적용
    - 어댑티 전체를 다시 구현하지 않아도 된다는 장점
    - 서브 클래스라서 어댑티의 행동을 오버라이드 할 수 있음.
    - 어댑터 하나만 있으면 가능.

## 실전 적용 어댑터 패턴

---

- `Enumeration`
- `Iterator`

### Enumeration을 Iterator에 적응하기.

- Iterator ⇒ Target Interface
    - `hasNext()`
    - `next()`
- Enumeration ⇒ Adaptee Interface
    - `hasMoreElements()`
    - `nextElement()`
- 각각의 요소에 대응. (`hasNext()` ⇒ `hasMoreElements()` || `next()` ⇒ `nextElement()`)
- 기존 코드에 있던 Enumeration도 새로운 코드에서는 Iterator처럼 보임.
- 타겟 인터페이스와 어댑티 인터페이스의 메소드가 완벽히 1대1 매칭이 되지 않는 상황에서는 완벽하게 적용 불가능.