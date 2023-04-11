package Seminar4;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        Team<Protector> protectors = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20)))
                .addPersons(new Archer("Bobin", 100, new Bow(15)));
        knights.addPersons(new Knight("John", 150, new Knife()))
                .addPersons(new Knight("Adam", 150, new Knife()));
        protectors.addPersons(new Protector("Sam", 200, new Shield(5)))
                .addPersons(new Protector("Smith", 200, new Shield(5)));
        Protector protector1 = new Protector("Sam", 200, new Shield(5));
        Protector protector2 = new Protector("Smith", 200, new Shield(5));
        Archer archer1 = new Archer("Robin", 100, new Bow(20));
        Archer archer2 = new Archer("Bobin", 100, new Bow(15));
        Battle fight = new Battle(protector1, protector2);
        fight.run();
    }
}
