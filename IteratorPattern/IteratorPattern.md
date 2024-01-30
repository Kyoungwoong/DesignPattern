# Iterator Pattern & Composite Pattern

### 객체에 컬렉션을 추가하는 다른 방법

- 메뉴 구현 방식이 다른 두 클래스 `PancakeHouseMenu` 클래스와 `DinerMenu` 클래스
- 앨리스의 요건
    - `printMenu()`: 메뉴 모든 항목 출력
    - `printBreakfastMenu()`: 아침 식사 항목 출력
    - `printLunchMenu()` : 점심 항목 출력
    - `printVegetarianMenu()` : 채식 주의자용 메뉴 항목 출력
    - `isItemVegetarian(name)` : 해당 항목이 채식주의자 메뉴면 true 리턴
- 구현의 어려움 ⇒ 메뉴에 똑같은 인터페이스 구현?

## 반복을 캡슐화하기

---

**바뀌는 부분을 캡슐화하라**

```java
Iterator iterator = breakfastMenu.createIterator();

while (iterator.hasNext()) {
		MenuItem menuItem = iterator.next();
}

Iterator iterator = lunchMenu.createIterator();

while (iterator.hasNext()) {
		MenuItem menuItem = iterator.next(); // 아예 동일
}
```

### 반복자 패턴 알아보기

- 반복 작업을 캡슐화
- `Iterator` 인터페이스의 메소드 `hasNext()`, `next()`
- **메뉴 구현이 캡슐화 되어 있음.**
    - 종업원은 메뉴에서 컬렉션을 어떻게 저장하고 있는지 알 필요가 없음.
    - 반복자만 구현한다면 다형성 활용하여 하나의 순환문으로 처리 가능
    - 종업원은 인터페이스만 알면 됨.

## 반복자패턴

---

<aside>
💡 **반복자패턴
컬렉션의 구현방법을 노출하지 않으면서 집합체 내의 모든 항목에 접근하는 방법 제공.**

</aside>

- 인터페이스와 구현이 간단.
- 각자의 비즈니스 로직만 처리 가능.

### 구조

- 공통된 인터페이스를 클라이언트가 참조할 수 있도록
- 서브 클래스는 인터페이스에 따라 개발.

### 단일 역할 원칙

- 어떤 클래스가 바뀌는 이유는 하나 뿐 이여야한다.

### Iterable 인터페이스

- 어떤 클래스던 Iterable을 구현한다면 그 클래스는 `iterator()` 메소드를 구현
    - Iterator 인터페이스를 구현하는 반복자 리턴
- `forEach()` 메소드 제공