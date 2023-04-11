package Seminar4;

public class Shield extends Shields {
    private String name;

    public Shield(int protect) {
        super(protect);
        this.name = "Shield";
    }

    @Override
    public int damage() {
        return 2;
    }

    @Override
    public String toString() {
        return "Shield{" +
                " name = " + name +
                super.toString() +
                '}';
    }
}