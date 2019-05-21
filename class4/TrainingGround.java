package class4;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(100);
        enemy.takeDamage(10);
        System.out.println(enemy.getHealth());

        Hero JHON = new Warrior("Jhon");
        JHON.attackEnemy();

        Archer JHON2 = new Archer("Jhon");
        JHON2.attackEnemy();
    }
}
