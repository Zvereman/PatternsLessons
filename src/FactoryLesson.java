public class FactoryLesson {
    public static void main(String[] ars) {
        FactoryF factory = new FactoryF();
        FCar toyota = factory.create("Toyota");
        FCar audi = factory.create("Audi");
        toyota.drive();
        audi.drive();
    }
}

interface FCar {
    void drive();
}

class FToyota implements FCar {

    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}

class FAudi implements FCar {

    @Override
    public void drive() {
        System.out.println("Drive Audi");
    }
}

class FactoryF {
    public FCar create(String typeOfCar) {
        switch (typeOfCar){
            case "Toyota" : return new FToyota();
            case "Audi" : return  new FAudi();
            default: return null;
        }
    }
}