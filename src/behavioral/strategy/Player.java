package behavioral.strategy;

public class Player {
    Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void defence() {
        strategy.defence();
    }
}
