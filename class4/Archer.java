package class4;

public class Archer extends Wizard {
    public Archer(String name) {
        super(name);
    }


    @Override
    public void attackEnemy() {
        System.out.println("Archer" + getName() + " атакует врага");
    }
}
