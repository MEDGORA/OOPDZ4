package Seminar4;

public abstract class Shields implements Weapon{
    private int protect;

    public Shields (int protect){
        this.protect = protect;
    }

    public int getProtect() {
        return protect;
    }

    @Override
    public String toString() {
        return "Shields{" +
                "protect = " + protect +
                "damage = " + damage() +
                '}';
    }
}
