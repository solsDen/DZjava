package qa.guru;

public class Car {

    int body;
    int wheel;
    String name;
    int interiorDecoration;

    public Car(int body, int wheel, String name, int interiorDecoration) {
        this.body = body;
        this.wheel = wheel;
        this.name = name;
        this.interiorDecoration = interiorDecoration;
    }

    void choisBody() {

        if (body <= 10) {
            System.out.println("Маленькая машинка би-би,ту-ту");
        } else   {
            System.out.println("Средняя машина");
        }
    }

    void choisWheel() {

        System.out.println("Размер вашего колеса равен: " + wheel);
    }

    void nameCar() {

        System.out.println("Название твоей машины: " + name);
    }

    void lvlDecoration() {

        if (interiorDecoration == 1) {
            System.out.println("Внутренняя отделка салона стоит 100 тыс.руб.");
        }
        else {
            System.out.println("Внутренняя отделка салона стоит 200 тыс.руб.");
        }
    }
}
