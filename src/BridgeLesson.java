public class BridgeLesson {
    public static void main(String[] args) {
        ICar toyotaCar = new ToyotaCar(new CarBridge());
        toyotaCar.drive();

        ITruck toyotaTruck = new ToyotaTruck(new TruckBridge());
        toyotaTruck.drive();

        ICar audiCar = new AudiCar(new CarBridge());
        audiCar.drive();

        ITruck audiTruck = new AudiTruck(new TruckBridge());
        audiTruck.drive();
    }
}

abstract class ICar {
    IBridge iBridge;

    public ICar(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    abstract void drive();
}

abstract class ITruck {
    IBridge iBridge;

    public ITruck(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    abstract void drive();
}

interface IBridge {
    void drive();
}

class CarBridge implements IBridge {
    @Override
    public void drive() {
        System.out.println("Drive car");
    }
}
class TruckBridge implements IBridge {
    @Override
    public void drive() {
        System.out.println("Drive truck");
    }
}

class ToyotaCar extends ICar {

    public ToyotaCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("Drive Toyota");
    }
}

class AudiCar extends ICar {

    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("Drive Audi");
    }
}

class ToyotaTruck extends ITruck {

    public ToyotaTruck(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("Drive Toyota Truck");
    }
}

class AudiTruck extends ITruck {

    public AudiTruck(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    void drive() {
        System.out.println("Drive Audi Truck");
    }
}