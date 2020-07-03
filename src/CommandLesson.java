import java.util.ArrayList;
import java.util.List;

public class CommandLesson {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        receiver.addCommand(new MouseClick());
        receiver.addCommand(new MousePress());
        receiver.runCommand();
    }
}

interface Command {
    void execute();
    void revert();
}

class MouseClick implements Command {
    @Override
    public void execute() {
        System.out.println("Click command");
    }

    @Override
    public void revert() {
        System.out.println("Revert");
    }
}

class MousePress implements Command {
    @Override
    public void execute() {
        System.out.println("Press command");
    }

    @Override
    public void revert() {
        System.out.println("Revert");
    }
}

class Receiver {
    List<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        commands.add(command);
    }

    void runCommand() {
        try {
            for (Command command : commands) {
                command.execute();
            }
        } catch (Exception e) {
            for (Command command : commands) {
                command.revert();
            }
        }
    }
}