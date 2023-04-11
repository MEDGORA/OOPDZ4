package Seminar4;

public class Protector extends Warrior<Shields>{
    public Protector(String name, int hp, Shields weapon) {
        super(name, hp, weapon);
    }

    public int getProtect(){
        return rand.nextInt(weapon.getProtect()+1);
    }

    @Override
    public String toString() {
        return "Protector{" +
                super.toString()+
                '}';
    }
}