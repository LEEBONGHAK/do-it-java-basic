package chapter4.ifexample;

public class SwitchCase {
    public static void main(String[] args) {
        int rank = 1;
        char medalColor;

        switch (rank) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                medalColor = 'A';
                break;
        }

        System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");
    }
}
