package pro.sky.java.course2;

public interface ServiceStation {
    Bicycle bicycle = new Bicycle();
    Truck truck = new Truck();
    Car car = new Car();

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    default void service(TypeOfTransport typeOfTransport) {
        if ((typeOfTransport == bicycle) || (typeOfTransport == truck) || (typeOfTransport == car)) {
            if (typeOfTransport == bicycle) {
                check((Bicycle) typeOfTransport);

            } else if (typeOfTransport == truck) {
                check((Truck) typeOfTransport);
            } else if (typeOfTransport == car) {
                check((Car) typeOfTransport);
            }
        } else System.out.println("Это что-то не веловипед и не грузовик и даже не машина!))");
    }

    default void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }

    default void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        }
    }

    default void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
        }
    }
}
