public class Main {
    public static void main(String[] args) {
        Tavern tavern = new Tavern();
        Adventurer adventurer1 = new Adventurer("Kirito", "S");
        Adventurer adventurer2 = new Adventurer("Akihiro", "B");

        tavern.subscribe(adventurer1);
        tavern.subscribe(adventurer2);

        String villageUnderAttack = "village is under attack!!!, protect civilians |  500 gold";
        String exterminateSlimes = "exterminate all the slimes near the town | 700 gold";

        tavern.addEvent(villageUnderAttack);

        tavern.unSubscribe(adventurer2);

        tavern.deleteEvent(villageUnderAttack);
        tavern.addEvent(exterminateSlimes);
    }
}