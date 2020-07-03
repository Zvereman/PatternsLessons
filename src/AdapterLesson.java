public class AdapterLesson {
    public static void main(String[] args) {
        KarWash karWash = new KarWash();
        karWash.washKar(new TruckWrap(new MyTruck()));
    }
}

class TruckWrap implements Kar {
    Truck truck;

    public TruckWrap(Truck truck) {
        this.truck = truck;
    }

    @Override
    public void wash() {
        truck.clean();
    }
}

interface Truck {
    void clean();
}

class MyTruck implements Truck {

    @Override
    public void clean() {
        System.out.println("Truck is clean");
    }
}

interface Kar {
    void wash();
}

class Auddi implements Kar {

    @Override
    public void wash() {
        System.out.println("Wash kar");
    }
}

class KarWash {
    public void washKar(Kar kar) {
        kar.wash();
    }
}