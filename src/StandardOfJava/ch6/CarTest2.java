package StandardOfJava.ch6;

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto",4); // Car(String color, String gearType, int door)를 호출
    }

    Car(String color){
        this(color, "auto", 4);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        // c1의 속성 출력
        // c2의 속성 출력
    }
}
