# 자바 입출력

## 스트림

## 스트림이란?

- 네트워크에서 자료의 흐름이 물과 같다는 의미에서 유래
- 다양한 입출력 장치에 독립적으로 일관성 있는 입출력을 제공하는 방식
- 입출력이 구현되는 곳 : 파일 디스크, 키보드, 마우스, 메모리 네트워크 등

### 스트림의 구분

- 대상 기준
  - 입력 스트림 / 출력 스트림
- 자료의 종류
  - 바이트 스트림 / 문자 스트림
- 기능
  - 기반 스트림 / 보조 스트림

#### 입력 스트림과 출력 스트림

- 입력 스트림: 대상으로부터 자료를 읽어 들이는 스트림
- 출력 스트림: 대상으로부터 자료를 출력하는 스트림
- 스트림의 종류

| 종류     | 예시                                                                       |
|--------|--------------------------------------------------------------------------|
| 입력 스트림 | `FileInputStream`, `FileReader`, `BufferedInputStream`, `BufferedReader` 등 |
| 출력 스트림 | `FileOutStream`, `FileWriter`, `BufferedOutStream`, `BufferedWriter` 등   |
  
  
#### 바이트 단위 스트림과 문자단위 스트림

- 바이트 단위 스트림: 바이트 단위로 자료를 처리하면서 문자는 깨짐 / 동영상, 음악 파일 등을 읽고 쓸 때 사용
- 문자 단위 스트림: 2 바이트 단위로 처리하도록 구현된 스트림
- 스트림의 종류

| 종류      | 예시                                                                                  |
|---------|-------------------------------------------------------------------------------------|
| 바이트 스트림 | `FileInputStream`, `FileOutStream`, `BufferedInputStream`, `BufferedWriterStream` 등 |
| 문자 스트림  | `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter` 등                    |
  
  
#### 기반 스트림과 보조 스트림

- 기반 스트림: 대상에 직접 자료를 읽고 쓰는 기능의 스트림
- 보조 스트림: 직접 읽고 쓰는 기능은 없이 추가적인 기능을 더해주는 스트림 / 직접 읽고 쓰는 기능은 없으므로 항상 기반 스트림이나 다른 보조 스트림을 생성자에 매개변수로 포함함
- 스트림의 종류

| 종류     | 예시                                                                                         |
|--------|--------------------------------------------------------------------------------------------|
| 기반 스트림 | `FileInputStream`, `FileOutStream`, `FileReader`, `FileWriter` 등                           |
| 보조 스트림 | `InputStreamReader`, `OutputStreamWriter`, `BufferedInputStream`, `BufferedWriterStream` 등 |
  
  
## 표준 입출력

- `System` 클래스의 표준 입출력 멤버
    ```java
    public class System {
        public static PrintStream out;
        public static InputStream in;
        public static PrintStream err;
    }
    ```
- `System.out`
  - 표준 출력(모니터) 스트림
- `System.in`
  - 표준 입력(키보드) 스트림
- `System.err`
  - 표준 에러 출력(모니터) 스트림

## Scanner 클래스

- `java.util` 패키지에 있는 입력 클래스
- 문자뿐 아니라 정수, 실수 등 다른 자료형도 읽을 수 있음
- 여러 대상에서 자료를 읽을 수 있음 (콘솔, 파일 등)
- 생성자

| 생성자                           | 설명                              |
|-------------------------------|---------------------------------|
| `Scanner(File source)`        | 파일을 매개변수로 받아 `Scanner` 생성       |
| `Scanner(InputStream source)` | 바이트 스트림을 매개변수로 받아 `Scanner` 생성  |
| `Scanner(Strint source)`      | `String`을 매개변수로 받아 `Scanner` 생성 |

## Console 클래스

- `System.in`을 사용하지 않고 콘솔에서 표준 입력을 할 수 있음
- 이클립스와는 연동이 되지 않음
- command 창에서 입력함
- 대표적인 메서드

| 메서드                     | 설명                     |
|-------------------------|------------------------|
| `String readLine()`     | 문자열을 읽음                |
| `char[] readPassword()` | 사용자에게 문자열을 보여 주지 않고 읽음 |
| `Reader reader()`       | `Reader` 클래스 반환        |
| `PrintWriter writer()`  | `PrintWriter` 클래스 반환   |

## 바이트 단위 스트림

### InputStream

- 바이트 단위 입력용 최상위 스트림
- 추상 메서드를 포함한 추상 클래스로 하위 클래스가 구현하여 사용
- 주요 하위 클래스

| 스트림 클래스                | 설명                                           |
|------------------------|----------------------------------------------|
| `FileInputStream`      | 파일에서 바이트 단위로 자료를 읽음                          |
| `ByteArrayInputStream` | `Byte` 배열 메모리에서 바이트 단위로 자료를 읽음               |
| `FilterInputStream`     | 기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스 |

- 주요 메서드

| 메서드                                    | 설명                                                                               |
|----------------------------------------|----------------------------------------------------------------------------------|
| `int read()`                           | 입력 스트림으로부터 한 바이트의 자료를 읽으며, 읽은 자료의 바이트 수를 반환                                      |
| `int read(byte[] b)`                   | 입력 스트림으로부터 `b[]` 크기의 자료를 `b[]` 에서 읽으며, 읽은 자료의 바이트 수를 반환                          |
| `int read(byte[] b, int off, int len)` | 입력 스트림으로부터 `b[]` 크기의 자료를 `b[]`의 `off` 변수 위치부터 저장하며 `len`만큼 읽는다. 읽은 자료의 바이트 수를 반환 |
| `void close()`                         | 입력 스트림과 연결된 대상 리소스를 닫음                                                           |

### OutputStream

- 바이트 단위 출력용 최상위 스트림
- 추상 메서드를 포함한 추상 클래스로 하위 클래스가 구현하여 사용
- 주요 하위 클래스

| 스트림 클래스                 | 설명                                          |
|-------------------------|---------------------------------------------|
| `FileOutputStream`      | 파일에서 바이트 단위로 자료를 쓰기                         |
| `ByteArrayOutputStream` | `Byte` 배열 메모리에서 바이트 단위로 자료를 쓰기              |
| `FilterOutputStream`    | 기반 스트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스 |

- 주요 메서드

| 메서드                                     | 설명                                                                                 |
|-----------------------------------------|------------------------------------------------------------------------------------|
| `int write()`                           | 출력 스트림으로부터 한 바이트의 자료를 출력, 출력한 자료의 바이트 수를 반환                                        |
| `int write(byte[] b)`                   | 출력 스트림으로부터 `b[]` 크기의 자료를 출력, 읽은 자료의 바이트 수를 반환                                      |
| `int write(byte[] b, int off, int len)` | 출력 스트림으로부터 `b[]` 크기의 자료를 `b[]`의 `off` 변수 위치부터 저장하며 `len`만큼 출력한다. 출력한 자료의 바이트 수를 반환 |
| `void flush()`                          | 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력                                            |
| `void close()`                          | 출력 스트림과 연결된 대상 리소스를 닫음. 출력 버퍼가 비워짐                                                 |

## 보조 스트림

- 실제 읽고 쓰는 스트림이 아닌 보조적인 기능을 추가하는 스트림
- 데코레이터 패턴
- `FilterInputStream`과 `FilterOutputStream`이 보조스트림의 상위 클래스
- 생성자의 매개 변수로 또 다른 스트림을 가짐

| 생성자                                               | 설명                            |
|---------------------------------------------------|-------------------------------|
| `protected FilterInputStream(InputStream in)`     | 생성자의 매개변수로 `InputStream`을 받음  |
| `protected FilterOutputStream(OutputStream out)`  | 생성자의 매개변수로 `OutputStream`을 받음 |

### InputStreamReader 와 OutputStreamWriter

- 바이트 단위로 읽거나 쓰는 자료를 문자로 변환해주는 보조 스트림

### Buffered 스트림

- 내부적으로 8192 바이트 배열을 가지고 읽거나 쓰기 기능을 제공하여 속도가 빨라짐

| 스트림 클래스                | 설명                           |
|------------------------|------------------------------|
| `BufferedInputStream`  | 바이트 단위로 읽는 스트림에 버퍼링 기능을 제공   |
| `BufferedOutputStream` | 바이트 단위로 출력하는 스트림에 버퍼링 기능을 제공 |
| `BufferedReader`       | 문자 단위로 읽는 스트림에 버퍼링 기능 제공     |
| `BufferedWriter`       | 문자 단위로 출력하는 스트림에 버퍼링 기능 제공   |

## 직렬화(serialization)

- 인스턴스의 상태를 그대로 저장하거나(serialization) 다시 복원하는(deserialization) 방식
- 파일에 쓰거나 네트워크 전송 시 사용
- `ObjectInputStream` 과 `ObjectOutputStream` 사용

| 생성자                                   | 설명                                                     |
|---------------------------------------|--------------------------------------------------------|
| `ObjectInputStream(InputStream in)`   | `InputStream`을 생성자의 매개변수로 받아 `ObjectInputStream`을 생성   |
| `ObjectOutputStream(InputStream out)` | `OutputStream`을 생성자의 매개변수로 받아 `ObjectOutputStream`을 생성 |

## 그 외 입출력 클래스

- `File` 클래스
  - 파일 개념을 추상화한 클래스
  - 입출력 기능은 없고 파일의 속성, 경로, 이름 등을 알 수 있음
- `RandomAccessFile` 클래스
  - 입출력 클래스 중 유일하게 파일 입출력을 동시에 할 수 있는 클래스
  - 파일 포인터가 있어 읽고 쓰는 위치의 이동이 가능
  - 다양한 자료형에 대한 메서드가 제공됨



