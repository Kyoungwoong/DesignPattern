# Factory Pattern

**느슨한 결합으로 객체지향 디자인**

- 객체의 인스턴스는 항상 공개 되어야 하는 것이 아니며 모든 것을 공개 했다가는 문제가 생길 수도 있음
- `new` 연산자가 **구상**을 생각!!
    - `new`를 사용하면 **구상 클래스의 인스턴스**가 만들어짐
    - 이는 구상 클래스를 바탕으로 코드를 수정해야 할 가능성이 커지고 유연성이 떨어짐.
      `Duck duck = new MallardDuck()`

### `new`의 문제?

- **구상 클래스 간의 변화되는 부분이 문제!**
- 인터페이스에 맞춰 코딩하면 변화에 대응이 가능함. ⇒ **다형성**
- 변경에는 닫혀있고 확장에는 열려있어야한다.

## 피자코드 만들기

---

```java
public class Pizza {

    public Pizza() {
    }

    Pizza orderPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new ChesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
```

- pizza는 type에 따라 구상 클래스의 인스턴스를 생성.
- 사라지는 피자와 새로 생기는 피자가 생기면 코드 지우고 코드 새로 추가해야됨.

### 객체 생성부분 캡슐화.(변화가 생기는 부분이므로)

- 객체 생성을 처리하는 클래스를 **팩토리**라고 함.
- SimplePizzaFactory가 OrderPizza()메소드가 새로 만든 객체의 클라이언트 생성해줌.

```java
public class SimplePizzaFactory {

    Pizza create(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
```

- 이러한 방법은 **static factory**라고 부름

## ClientCode 수정하기

---

**객체에 팩토리 인스턴스 저장하기**

## 다양한 팩토리 만들기

---

**뉴욕 스타일의 피자와 시카고 스타일의 피자 가게가 있음**

```java
NYPizzaFactory nyFactory = new NYPizzaFactory();
Pizzastore nyStore = new PizzaStore(nyFactory);
nystore.orderPizza("cheese");

ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
Pizzastore chicagoFactory = new PizzaStore(chicagoFactory);
chicagoFactory.orderPizza("cheese");
```

- 각각의 지점들은 굽는 방식이 달라지거나 피자의 토핑이 달라질 수 있음.
- PizzaStore를 만들어 각각 스타일대로 구현

## 팩토리 메소드 패턴 살펴보기

---

- **팩토리 패턴**은 **객체 생성을 캡슐화**
- **팩토리 메서드 패턴**은 서브클래스에서 어떤 클래스를 만들지 정하므로, **객체 생성을 캡슐화**
- 제품 클래스(`Pizza`) 와 생산자 클래스(`PizzaStore`)를 분리함으로써 구체적인 구현은 구상 클래스가 책임 지도록.

<aside>
💡 **팩토리 메서드 패턴
객체를 생성할 때 필요한 인터페이스를 만들고 어떤 클래스의 인터페이스를 만들지는 서브 클래스에서 결정하도록 함.**

</aside>

## 의존성 뒤집기 원칙(Dependency Inversion)

---

- **구상 클래스의 의존성을 떨어뜨리기**
- 즉, 고수준 구성요소는 저수준 구성요소에 의해 정의되는 행동이 들어있는 구성요소
    - PizzaStore는 고수준 구성요소
    - Pizza 클래스는 저수준 구성요소.

<aside>
💡 **추상화된 것에 의존하게 만들고, 구상 클래스에 의존하지 않게 만든다.**

</aside>

### DI를 지키는 방법

- 변수에 구상 클래스의 레퍼런스를 저장하지 않는다.
- 구상 클래스에서 유도된 클래스를 만ㄴ들지 않는다
- 베이스 클래스에 이미 구현되어 있는 메소드를 오버라이딩하지 않는다.

### 지역마다 재료가 다를 수 있음

⇒ 지역마다 **원재료 군으로 묶기**

### 추상 팩토리 패턴

<aside>
💡 **구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생산하는 인터페이스 제공.**

</aside>
