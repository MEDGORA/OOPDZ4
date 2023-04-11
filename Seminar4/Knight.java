package Seminar4;

public class Knight extends Warrior<Knife>{
    public Knight(String name, int hp, Knife weapon) {
        super(name, hp, weapon);
    }

    @Override
    public String toString() {
        return "Knight{" +
                super.toString()+
                '}';
    }
}
