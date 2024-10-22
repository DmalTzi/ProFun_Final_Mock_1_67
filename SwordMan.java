class SwordMan {
    private int Level = 1;
    private int HP;
    private int ATK;
    private String name;
    private String signatureQuote;
    private boolean isDeath = false;

    SwordMan(String name, int level, int atk, int hp, String signature) {
        this.name = name;
        ATK = atk;
        HP = hp;
        Level = level;
        signatureQuote = signature;
    }

    void saySignatureQuote() {
        if(signatureQuote != null){
            System.out.println("I can't say");
            return;
        }
        System.out.println(signatureQuote);
    }

    void heal(int amount) {
        if (isDeath) {
            System.out.println("This character is death!");
            return;
        }
        System.out.println("HP increase " + amount);
        HP += amount;
    }

    void attack(SwordMan person) {
        if (person.isDeath) {
            System.out.println(person.name + " already death.");
            return;
        }
        if(ATK < person.getHp()) {
            System.out.println("You not strong enough!");
            System.out.println("--You Died--");
            isDeath = true;
            return;
        }
        
        int getLevel = person.getLevel();
        Level += getLevel*2;
        ATK *= getLevel*2;
        HP *= getLevel*3;
        person.killed();
        System.out.println("Congraz You level up!!");
    }

    void farm(Animal animal) {
        if (animal.getHP() > ATK) {
            System.out.println("You so weak");
            int damage = animal.getAttack();
            System.out.println(animal.getName() + " attack with " + damage + " Damage.");
            HP -= damage;
            if (HP <= 0) {
                this.killed();
                return;
            }
            System.out.println("Your HP reamain is " + HP);
            return;
        }else if(animal.getIsDeath()){
            System.out.println(animal.getName() + " is already.");
            return;
        }
        System.out.println(name + " kill " + animal.getName() + " and get " + animal.getLevel() + " Lv.");
        int getLevel = animal.getLevel();
        Level += getLevel;
        ATK *= getLevel+1;
        HP *= getLevel+2;
        animal.killed();
    }

    void whatIsYourName() {
        System.out.println("----- " + name + " -----");
    }

    void myLevelIs() {
        System.out.println("I'm so strong! I have " + Level +" Level.");
    }

    void myHP() {
        System.out.println("I'm OK! My HP is " + HP);
    }

    void whatIsAttack() {
        System.out.println("My ATK is " + ATK);
    }

    int getLevel() {
        return Level;
    }

    int getHp() {
        return HP;
    }

    private void killed() {
        isDeath = true;
        System.out.println("You kill "+ name + " " + name + " are died");
    }

    @Override
    public String toString() {
        return "(" + name + ") " + "Lv. " + Level + " ATK, HP " + ATK + " " + HP;
    }
}