public class SingletonLesson {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        singleton.i = 5;
        System.out.println(singleton1.i);
    }
}

class Singleton {
    int i = 0;
    static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}
