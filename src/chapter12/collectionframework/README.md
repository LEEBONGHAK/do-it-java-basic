# Collection Framework

- 프로그램 구현에 필요한 자료구조(Data Structure) 를 구현해 놓은 라이브러리
- `java.util` 패키지에 구현되어 있음
- 개발에 소요되는 시간을 절약하면서 최적화된 알고리즘을 사용할 수있음
- 여러 인터페이스와 구현 클래스 사용 방법을 이해해야 함

## Collection Interface

- 하나의 객체를 관리하기 위한 메서드가 정의된 인터페이스
- 하위의 `List`와 `Set` 인터페이스가 있음

| 분류           | 설명                                                                                                    |
|--------------|-------------------------------------------------------------------------------------------------------|
| `List` 인터페이스 | 순서가 있는 자료관리, 중복 허용.<br/>이 인터페이스를 구현한 클래스는 `ArrayList`, `Vector`, `LinkedList`, `Stack`, `Queue` 등이 있음 |
| `Set` 인터페이스  | 순서가 정해져 있지 않음, 중복을 혀용하지 않음.<br/>이 인터페이스를 구현한 클래스는 `HashSet`, `TreeSet` 등이 있음                          |

- 여러 클래스들이 Collection 인터페이스를 구현함
- Collection 인터페이스에 정의된 주요 메서드

| 매서드                        | 설명                                   |
|----------------------------|--------------------------------------|
| `boolean add(E e)`         | Collection 객체를 추가                    |
| `void clear()`             | Collection 모든 객체를 제거                 |
| `Iterator<E> iterator`     | Collection을 순한할 반복자(iterator)를 반환    |
| `boolean remove(Object o)` | Collection에 매게변수에 해당하는 인스턴스가 존재하면 제거 |
| `int size()`               | Collection에 있는 요소의 개수를 반환            |

---

## List 인터페이스

- Collection 하위 인터페이스
- 객체를 순서에 따라 저정하고 관리하는데 필요한 메서드가 선언된 인터페이스
- 배열의 기능을 구현하기 위한 인터페이스
- `ArrayList`, `Vector`, `LinkedList` 등이 많이 사용됨

### ArrayList 와 Vector 클래스

- 객체의 배열을 구현한 클래스
- `Vector` 는 자바2 부터 제공된 클래스
- **멀티 쓰레드 상태에서 리소스에 대한 동기화가 필요한 경우 `Vector`를 사용**
- **일번적으로 `ArrayList`를 더 많이 사용**
- `ArrayList`에 동기화 기능이 추가 되어야 하는 경우
    ```java
    Collections.synchronizedList(new ArrayList<String>());
    ```

### LinkedList 클래스

- 논리적으로 순차적인 자료구조가 구현된 클래스
- 다음 요소에 대한 참조값을 가지고 있음
- 요소의 추가 / 삭제에 드는 비용이 배열보다 작음

### Stack 과 Queue 클래스

- `Stack` 과 `Queue`의 기능은 구현된 클래스가 있지만 `ArrayList` 또는 `LinkedList`를 활용해 사용할 수도 있음
- `Stack` : Last In First Out (LIFO)
- `Queue` : First In First Out (FIFO)

---

## Iterator 사용하여 순회하기

- Collection 의 개체를 순회하는 인터페이스
- `iterator()` 메서드 호출
  ```java
  Iterator<E> ir = memberArrayList.iterator();
  ```
- 선언된 메서드

| 메서드                 | 설명                                            |
|---------------------|-----------------------------------------------|
| `boolean hasNext()` | 이후에 요소가 더 있는지를 체크하는 메서드이며, 요소가 있다면 `true`를 반환 |
| `E next()`          | 다음에 있는 요소를 반환                                 |

---

## Set 인터페이스

- Collection 하위의 인터페이스
- 중복을 허용하지 않음
- 유일한 값이나 객체를 관리할 때 사용
- `List`는 순서 기반의 인터페이스이지만, `Set`은 순서가 없음
- 저장된 순서와 출력 순서는 다를 수 있음
- `get(i)` 메서드가 제공되지 않음

### TreeSet 클래스

- 객체의 정렬에 사용되는 클래스
- 중복을 허용하지 않으면서 오름차순 / 내림차순으로 객체를 정렬
- 내부적으로 이진 검색 트리 (Binary Search Tree)로 구현되어 있음
- 이진 검색 트리에 자료가 저장할 때 비교하여 저장될 위치를 정함
- 객체 비교를 위해 `Comparable` 이나 `Comparator` 인터페이를 구현해야 함 (필수)

#### Comparable Interface and Comparator Interface

- 정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
- `Comparable` 은 `compareTo()` 메서드를 구현
  - 매개 변수와 객체 자신(this)를 비교
- `Comparator` 는 `compare()` 메서드를 구현
  - 두 개의 매개 변수를 비교
  - `TreeSet` 생성자에 `Comparator`가 구현된 객체를 매개변수로 전달
    ```java
    TreeSet<Memeber> treeSet = new TreeSet<Member>(new Member());
    ```
- 일반적으로 `Comparable`을 더 많이 사용
- 이미 `Comparable`이 구현된 경우 `Comparator`를 이용해여 다른 정렬 방식을 정의할 수 있음

---

## Map 

- key-value pair 의 객체를 관리하는데 필요한 메서드가 정의됨
- key는 중복될 수 없음
- 검색을 위한 자료구조
- key를 이용해 값을 저장하거나 검색, 삭제 할 때 사용하면 편리
- 내부적으로 hash 방식으로 구현됨
  ```java
  index = hash(key) // index는 저장 위치
  ```
- key가 되는 객체는 객체의 유일성 여부를 알기 위해 `equals()`와 `hashCode()`메서드를 재정의 함

### HashMap 클래스

- `Map` 인터페이스를 구현 한 클래스 중 가장 일반적으로 사용하는 클래스
- `HashTable` 클래스는 자바2 부터 제공된 클래스로 `Vector`처럼 동기화를 제공
- 여러 메서드를 활용해 pair 자료를 쉽고 빠르게 관리 가능

### TreeMap 클래스

- key 객체를 정렬하여 key-value를 pair로 관리하는 클래스
- key에 사용되는 클래스에 `Comparable`, `Comparator` 인터페이스를 구현
- java에 많은 클래스들은 이미 `Comparable`이 구현되어 있음
- 구현된 클래스를 key로 사용하는 경우 구현할 필요 없음