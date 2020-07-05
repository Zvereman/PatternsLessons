public class MVCLesson {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}

class Studdent {
    String name = "Dima";
    int age = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface ModelLayer {
    Studdent getStudent();
}

class DBLayer implements ModelLayer {
    @Override
    public Studdent getStudent() {
        return new Studdent();
    }
}

class FileSystemLayer implements ModelLayer {
    @Override
    public Studdent getStudent() {
        return new Studdent();
    }
}

interface View {
    void showStudent(Studdent studdent);
}

class ConsoleView implements View {
    @Override
    public void showStudent(Studdent studdent) {
        System.out.println("Students name - " + studdent.getName() + "\nStudents age - " + studdent.getAge());
    }
}

class Controller {
    ModelLayer modelLayer = new DBLayer();
    View view = new ConsoleView();
    void execute() {
        Studdent studdent = modelLayer.getStudent();
        view.showStudent(studdent);
    }
}