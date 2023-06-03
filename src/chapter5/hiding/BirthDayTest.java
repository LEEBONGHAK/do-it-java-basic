package chapter5.hiding;

class BirthDay {
    // private 접근 제어자는 클래스 내부에서만 사용할 수 있다는 의미
    // public 접근 제어자는 외부 모든 클래스에서 사용할 수 있다는 의미
    // private/public이 없다면 같은 패키지 내의 클래스에서만 사용할 수 있다는 의미
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if (this.month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("날짜 오류 입니다.");
            } else {
                this.day = day;
            }
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay day = new BirthDay();

        day.setMonth(2);
        day.setDay(28);
        day.setYear(2023);
    }
}