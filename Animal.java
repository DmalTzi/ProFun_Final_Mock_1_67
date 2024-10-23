public class Animal {
    private String name;
    private int Level;
    private int Attack;
    private int HP;
    private boolean isDeath = false;

    Animal(String Name, int level, int attack, int hp) {
        name = Name;
        Level = level;
        Attack = attack;
        HP = hp;
    }

    void sayMyName() {
        System.out.println("H.. Hi Watashiwa " + "\"" + name + "\"");
    }

    void doYouKnowMyLevel() {
        System.out.println("My Level is " + Level);
    }

    void IamVeryStrong() {
        System.out.println("My power is " + Attack); 
    }

    void myHP() {
        System.out.println("HP is " + HP);
    }

    int getLevel() {
        return Level;
    }

    int getAttack() {
        return Attack;
    }

    int getHP() {
        return HP;
    }

    boolean getIsDeath() {
        return isDeath;
    }

    String getName() {
        return name;
    }

    void killed() {
        if (isDeath) {
            System.out.println("It's already death!!");
        }else {
            isDeath = true;
            System.out.println("" + name + " is Death.");
        }
    }

    public String toString() {
        return "Level is " + Level + " (" + name + ") " + "Attack is " + Attack + " HP is " + HP + " Still alive " + !isDeath;
    }
}
