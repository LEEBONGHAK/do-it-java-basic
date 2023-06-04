# JAVA Basic Package

## java.lang 패키지

- 프로그래밍 시 `import` 하지 않아도 pre-compile 단계에서 자동으로 `import` 됨
- `import java.lang.*;` 문장이 추가됨
- 많이 사용하는 기본 클래스들이 속한 패키지
- `String, Integer, System` 등

## Object 클래스

- **모든 클래스의 최상위 클래스**
- `java.lang.Object` 클래스
- 모든 클래스는 `Object` 클래스에서 상속 받음
- 모든 클래스는 `Object` 클래스의 메서드를 사용할 수 있음
- 모든 클래스는 `Object` 클래스의 메서드 중 일부는 재정의 할 수 있음 (`final` 로 선언된 메서드는 재정의 불가)
- 컴파일러가 pre-compile 단계에서 클래스에 `extends Object`를 추가 함

### 대표적인 Object 클래스 메서드
  
| 메서드                    | 설명                                                                                        |
|------------------------|-------------------------------------------------------------------------------------------|
| `String toString()`    | 객체를 문자열로 표현하여 반환한다.<br/>재정의하여 객체에 대한 설명이나 특정 멤버 변수 값을 반환한다.                               |
| `boolean equals(Object obj)` | 두 인스턴스가 동일한지 여부를 반환한다.<br/>재정의하여 논리적으로 동일한 인스턴스임을 정의할 수 있다.                               |
| `int hashCode()`       | 객체의 해시 코드 값을 반환한다.                                                                        |
| `Object clone()`       | 객체를 복제하여 동일한 멤버 변수 값을 가진 새로운 인스턴슬르 생성한다.                                                  |
| `Class getClass()` | 객체의 `Class` 클래스를 반환한다.                                                                     |
| `void finalize()`      | 인스턴스가 힙 메모리에서 제거되 ㄹ때 가비지 컬렉터(GC)에 의해 호출되는 메서드이다.<br/>네트워크 연결 해제, 열려 있는 파일 스트림 해제 등을 구현한다. |
| `void wait()`          | 멀티스레드 프로그램에서 사용하는 메서드이다.<br/>스레드를 '기다리는 상태'(non-runnable)로 만든다.                           |
| `void notify()`        | `wait()`메서드에 의해 기다리고 있는 스레드(non-runnable 상태)를 실행 가능한 상태(runnable)로 가져온다.                  |

#### toString() 메서드

- `Object` 클래스의 메서드
- 객체의 정보를 `String`으로 바꿔서 사용할 때 많이 사용됨
- `String`, `Integer` 클래스는 이미 재정의가 되어 있다. 
  - `String`은 문자열 반환
  - `Integer`은 정수 값 반환

#### equals() 메서드

- 두 인스턴스의 주소 값을 비교하여 `true`/`false` 를 반환
- 재정의하여 두 인스턴스가 논리적으로 동일함의 여부를 반환
- `String`, `Integer` 클래스는 이미 재정의가 되어 있다.
  - `String`은 문자열이 같은지 확인
  - `Integer`은 정수 값이 같은지 확인

#### hashCode() 메서드

- `hash`: 정보를 저장, 검색하기 위해 사용하는 자료구조
- 자료의 특정 값(키 값)에 대해 저장 위치를 반환해주는 해시 함수를 사용함
- 해시 함수는 어떤 정보인가에 따라 다르게 구현됨
- `hashCode()` 메서드는 인스턴스의 저장 주소를 반환함
- 힙 메모리에 인스턴스가 저장되는 방식이 `hash`
- `hashCode()`의 반환값: 자바 가상 머신(JVM)이 저장한 인스턴스의 주소값을 10진수로 나타냄
- 만약 재정의된 `equals()` 메서드 값이 `true`이면, 동일한 `hashCode()`값을 반환해야함.
- 즉, 논리적으로 동일함을 위해 `equals()` 메서드를 재정의 하였다면, `hashCode()` 메서드도 재정의하여 동일한 값이 반환되도록 해야함
- - `String`, `Integer` 클래스는 `equals()` 메서드와 함께 `hashCode()` 메서드가 재정의가 되어 있다.
  - `String`은 동일한 문자열 인스턴스에 대해 동일한 정수가 반환됨
  - `Integer`은 동일한 정수값의 인스턴스에 대해 같은 정수값이 반환됨

#### clone() 메서드

- 객체의 원본을 복제하는데 사용하는 메서드
- 원본을 유지해 놓고 복사본을 사용할 때 사용
- 기본 틀(prototype)을 뒤고 복잡한 생성과정을 반복하지 않고 복제
- `clone()` 메서드를 사용하면 객체의 정보(멤버 변수 값)가 같은 인스턴스가 또 생성되는 것이므로 객체 지향 프로그램의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
- 객체의 `clone()` 메서드 사용을 허용한다는 의미로 `Cloneable` 인터페이스를 명시해 줌
  ```java
  class Circle implements Cloneable {
    Point point;
    int radius;
  }
  ```
  
## String 클래스

- `String` 을 선언하는 두 가지 방법
  ```java
  String str1 = new String("test"); // 생성자의 매개변수로 문자열 생성
  String str2 = "test";             // 문자열 상수를 가리키는 방식
  ```
- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(`constant pool`)에 있는 주소를 참조하는 방법 2가지
- 한번 생성된 `String` 값(문자열)은 불면 (immutable)
- 2개의 문자열을 연결하면 새로운 인스턴스가 생성됨
- 문자열 연결을 계속하면 메모리에 garbage 가 많이 생길 수 있음

### StringBuilder, StringBuffer 사용하기

- 내부적으로 가변적인 `char[]` 배열을 가지고 있는 클래스
- 문자열을 여러 번 연결하거나 변경할 때 사용하면 유용 한 클래스
- 매번 새로 생성하지 않고 기존 배열을 변경하므로 garbage 가 발생하지 않음
- `StringBuffer` 클래스는 멀티 쓰레드 프로그래밍에서 동기회 (synchronization) 을 보장
- 단일 쓰레드 프로그램에서는 `StringBuilder` 를 사용하기를 권장
- `toString()` 메서드로 `String` 반환

## Wrap 클래스

- 기본 자료형(primitive data type)에 대한 클래스

  | 기본형 | `Wrapper` 클래스 |
  |-----------|---|
  | `boolean` | `Boolean` |
  | `int` |`Byte`|
  | `char` |`Character`|
  | `short` |`Short`|
  | `int` |`Integer`|
  | `long` |`Long`|
  | `float` |`Float`|
  | `double` |`Double`|

## 오토 박싱(autoboxing) / 언박싱(unboxing)

- java 5.0 이상
- `Integer`는 객체이고, `int`는 4 바이트 기본 자료형이지만 2개의 자료를 연산할 때 자동으로 변환이 일어남
  ```java
  Integer i = new Integer(100); // Integer i = 100; 도 가능
  int num = 20;
  int sum = i + num;    // 언박싱
  Integer i2 = num;     // 오토 박싱
  ```
  
## Class 클래스

- 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성됨
- class 파일에는 객체의 정보 (멤버변수, 메서드, 생성자 등)가 포함되어 있음
- `Class` 클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음

### Class 클래스 오기

1. `Object` 클래스의 `getClass()` 메서드 사용하기
```java
String s = new String("test");
Class c = s.getClass();
```
2. 클래스 파일 이름을 Class 변수에 직접 대입하기
```java
Class c = String.Class;
```
3. `Class.forName("클래스 이름")` 메서드 사용하기
```java
Class c = Class.forName("java.lang.String");
```

### Clas 클래스로 정보 가져오기

- reflection 프로그래밍: `Class` 클래스를 이용해 클래스의 정보(생성자, 멤버변수, 메서드)를 가져오고 이를 활용해 인스턴스를 생성하고, 메서드를 호출하는 등의 프로그래밍 방식
- 로컬 메모리에 객체가 없어 객체의 데이터 타입을 직접 알 수 없는 경우(원격에 객체가 있는 경우 등) 객체 정보만을 이용해 프로그래밍할 수 있다.
- `Constructor`, `Method`, `Filed` 등 `java.lang.reflect` 패키지에 있는 클래스들을 활용해 프로그래밍
- 일반적으로 자료형을 알 수 있는 경우에는 사용하지 않음

### Class.forName() 메서드로 동적 로딩하기

> 동적 로딩(dynamic loading)?
> 컴파일 시 데이터 타입이 모두 binding 되어 자료형이 로딩되는 것(static loading)이 아닌 **실행 중에 데이터 타입을 알고 binding 되는 방식**

- 프로그래밍 할 때는 어떤 클래스를 사용할 지 모를 때 변수로 처리하고 실행될 때 해당 변수에 대입된 값의 클래스가 실행될 수 있도록 `Class` 클래스에서 제공하는 `static` 메서드
- 실행 시 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용함
- 컴파일 타임에 체크할 수 없으므로 해당 문자열에 대한 클래스가 없는 경우 예외(`ClassNotFoundException`)이 발생할 수 있음

```java
String className = "java.lang.String";
Class sClass = Class.forName(className);
```