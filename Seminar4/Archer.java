package Seminar4;

public class Archer extends Warrior<Throwing>{
    public Archer(String name, int hp, Throwing weapon) {
        super(name, hp, weapon);
    }

    public int getRange(){
        return rand.nextInt(weapon.getDistance()+1);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString()+
                '}';
    }
}
