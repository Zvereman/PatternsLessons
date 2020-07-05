public class TemplateLesson {
    public static void main(String[] args) {
        Game template = new Poker();
        template.run();
    }
}

abstract class Game {
    abstract void startGame();
    abstract void play();
    abstract void endGame();

    void run() {
        startGame();
        play();
        endGame();
    }
}

class Poker extends Game {
    @Override
    void startGame() {
        System.out.println("Start Game");
    }

    @Override
    void play() {
        System.out.println("Play Game");
    }

    @Override
    void endGame() {
        System.out.println("End Game");
    }
}