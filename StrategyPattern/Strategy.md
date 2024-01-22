# Strategy Pattern

## SimUduck

---

- 모든 오리가 할 수 있는 동작 `SimpleAdapter.Duck` 클래스에서 정의
    - `quack()`
    - `swim()`
    - `display()`
        - 모든 오리의 동작이 다르므로 추상 메소드에서 정의
- `SimpleAdapter.MallardDuck` 클래스와 `RedHeadDuck` 클래스가 SimpleAdapter.Duck 클래스를 상속받아서 display override
- 이후에 모든 오리에게 날 수 있는 동작을 정의하고 싶음
    - `SimpleAdapter.Duck` 클래스에서 `fly()` 메소드 추가로 정의로 해결 가능

### 문제발생

- fly() 메소드는 일부 SimpleAdapter.Duck 클래스를 상속한 서브 클래스에만 되어야했는데 모든 서브 클래스에 적용이 다 되어버림

## 해결책

---

### 1. 인터페이스 설계

- 모든 오리가 날지 못함 + 모든 오리가 꽥꽥거리면서 울지 않음
    - `Flyable`, `Quackable` 이라는 인터페이스 설계

### 2. 캡슐화

💡 애플리케이션에서 **달라지는 부분**을 찾아내고 **달라지지 않는 부분과 분리**.

- **달라지는 부분을 찾아서 나머지 코드에 영향을 주지 않도록 캡슐화**
    - 코드를 변경하는 과정에서 의도치 않게 발생하는 일을 줄이면서 시스템의 유연성을 향상.
- **구현보다는 인터페이스에 맞춰 프로그래밍한다.**
    - 각 행동은 인터페이스로 표현(`FlyBehavior`, `QuackBehavior`…)
    - 메소드는 `SimpleAdapter.Duck` 클래스에서 구현X. 인터페이스에서 먼저 정의

💡 구현보다는 **인터페이스에 맞춰 프로그래밍**한다.

## 오리 행동 통합하기

---

**나는 행동과 꽥꽥거리는 행동을 `SimpleAdapter.Duck` 클래스에서 정의한 메소드를 써서 구현하지 않고 다른 클래스로 위임하는 행동.**

- `SimpleAdapter.Duck` 클래스에 `FlyBehavior`와 `QuackBehavior`을 인스턴스 변수로 저장.
    - `SimpleAdapter.Duck` 클래스는 인터페이스에서 구현한 `fly()`와 `quack()` 메소드를 실행하기 위한 메소드 정의(`performFly()`, `performQuack()`)

### Example

```java
public class SimpleAdapter.MallardDuck extends SimpleAdapter.Duck {

    public SimpleAdapter.MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("SimpleAdapter.MallardDuck!");
    }
}
```

💡 특정 구현에 맞춰서 프로그래밍하면 안됨.

하지만 `new FlyWithWings()`처럼, 특정 객체에 구현되어 있는 구상 인스턴스를 만들었음.
⇒ 잘못되었지만 1장이라 이처럼 표현

### 동적으로 행동 지정하기

- SimpleAdapter.Duck 클래스에 Setter method 정의(`setQuackBehavior()`, `setFlyBehavior()`)

### 두 클래스를 합치는 방법

💡 상속보다는 **구성을 활용**

- A에는 B가 있다. ⇒ `SimpleAdapter.Duck` 클래스에 `FlyBehavior`와 `QuackBehavior`가 있어서 `SimpleAdapter.Duck` 클래스에 나는 행동과 꽥꽥거리는 행동을 위임. ⇒ **구성**

# 전략패턴

---

### 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해주는 패턴

### 클라이언트로부터 알고리즘을 분리해서 독립적으로 분리.

### 요약 :

변화가 생길 기능(행동:behavior)을 예상하여 이를 캡슐화(및 추상화) 한다.

캡슐화 후 각 기능별로 구현해두고(ex: fly 중 noWay, WithWing, Rocket 등)

각 객체별로 사용할 기능을 (쉽게) 교환 받는다.

각 기능들이 추상화되어 있어 재사용성이 좋고, 수정이 용이하다.

### 기억 추적 :

서브클래스는 단순히 super 클래스를 상속받는식의 구현이 아닌,

interface, abstract 등을 이용하여 기능의 동작만 받음.

각 기능은 인터페이스를 구현하여 미리 정의해두고 모델은 이를 조합하여 기능을 만들어가는 방식.
