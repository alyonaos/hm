package class4;

/**
 * Создать класс Hero, представляющий собой героя и содержащий поле name.
 * Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
 * Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
 * Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.
 */

public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getDamage();

    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Атакует врага");
        enemy.takeDamage(getDamage());
        System.out.println("У врага осталось " + enemy.getHealth() + " очков здоровья!");
    }

}
