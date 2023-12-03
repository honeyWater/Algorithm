package StandardOfJava.ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        // 클래스변수(static변수)는 객체생성없이 '클래스이름.클래스변수'로 직접 사용 가능하다.

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;      // 인스턴스변수의 값을 변경한다.

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        // c1, c2 kind number 크기 출력

        c1.width = 50;
        c1.height = 80; // 클래스변수의 값을 변경한다.

        // 변경된 크기 출력
    }
}

class Card{
    // 인스턴스변수
    String kind;
    int number;

    // 클래스변수
    static int width = 100;
    static int height = 250;
}