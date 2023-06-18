package chapter15.stream.serialization;

import java.io.*;

class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -3788946118184643150L;
    String name;
    // transient 키워드의 경우 직열화 시 해당 부분을 직열화하지 않겠다는 의미
    String title;

    public Person() {
    }

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return name + ", " + title;
    }

    // Externalizable 인터페이스 사용 시 구현 필요 메서드들
//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//
//    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person person1 = new Person("Lee", "Manager");

        try (FileOutputStream fos = new FileOutputStream("serial.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(person1);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Object obj = ois.readObject();
            if (obj instanceof Person) {
                Person p = (Person) obj;
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
