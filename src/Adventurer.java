import interfaces.ISubscriber;

public class Adventurer implements ISubscriber {
    private final String name;
    private final String rank;

    public Adventurer(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public void update(String event) {
        System.out.println("Adventurer of " + rank + " rank," + name + ", " + event );
    }
}
