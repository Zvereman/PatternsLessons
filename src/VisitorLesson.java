public class VisitorLesson {
    public static void main(String[] args) {
        Aminal dog = new Dog();
        dog.doJob(new ConcreteVisitor());
        Aminal cat = new Cat();
        cat.doJob(new ConcreteVisitor());
    }
}

interface Aminal {
    void doJob(Visitor visitor);
}

class Dog implements Aminal {
    @Override
    public void doJob(Visitor visitor) {
        visitor.doDog();
    }
}

class Cat implements Aminal {
    @Override
    public void doJob(Visitor visitor) {
        visitor.doCAt();
    }
}

interface Visitor {
    void doDog();

    void doCAt();
}

class ConcreteVisitor implements Visitor {
    @Override
    public void doDog() {
        System.out.println("Wof");
    }

    @Override
    public void doCAt() {
        System.out.println("Meow");
    }
}