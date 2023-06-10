# 제네릴(Generic) 프로그래멩

- 변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 **여러 자료형을 변환될 수 있도록 프로그래밍하는 방식**
- 실제 사용되는 참조 자료형으로의 변환은 **컴파일러가 검증**하므로 안정적인 프로그래밍 방식
- 컬렉션 프레임워크에서 많이 사용되어 있음

## 제네릭 클래스 정의하기

- 여러 참조 자료형으로 대체될 수 있는 부분을 하나의 문자로 표현
- 이 문자를 자료형 매개변수라고 함

```java
public class GenericPrinter<T> {
    private T material;
    
    public void setMaterial(T material) {
        this.material = material;
    }
    
    public T getMaterial() {
        return material;
    }
}
```

## `<T extends 클래스>` 

- `T` 가 사용될 클래스를 제한하기 위해 사용
