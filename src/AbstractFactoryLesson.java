public class AbstractFactoryLesson {
    public static void main(String[] ars) {
        Factory carFactory = new AbstractFactory().createFactory("CarFactory");
        Factory tankFactory = new AbstractFactory().createFactory("TankFactory");
        Car toyota = carFactory.createCar("Toyota");
        Car audi = carFactory.createCar("Audi");
        toyota.drive();
        audi.drive();
        Tank T51 = tankFactory.createTank("T51");
        Tank T52 = tankFactory.createTank("T52");
        T51.drive();
        T52.drive();
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}

class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }

    @Override
    public Tank createTank(String typeOfCar) {
        return null;
    }
}

interface Tank {
    void drive();
}

class T51 implements Tank {

    @Override
    public void drive() {
        System.out.println("Drive T51");
    }
}

class T52 implements Tank {

    @Override
    public void drive() {
        System.out.println("Drive T52");
    }
}

class TankFactory implements Factory {
    public Tank createTank(String typeOfTank) {
        switch (typeOfTank) {
            case "T51":
                return new T51();
            case "T52":
                return new T52();
            default:
                return null;
        }
    }

    @Override
    public Car createCar(String typeOfTank) {
        return null;
    }
}

interface  Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory){
            case "CarFactory" : return new CarFactory();
            case "TankFactory" : return new TankFactory();
            default: return null;
        }
    }
}

