class MockMMO {
    public static void main(String[] Satana) {
        System.out.println("\n-----Demo1-----\n");
        demo1();
        System.out.println("\n-----Demo2-----\n");
        demo2();
        System.out.println("\n-----Demo3-----\n");
        demo3();
    }

    static void demo3() {
        SwordMan person1 = new SwordMan("Audy", 1, 5, 10, null);
        SwordMan person2 = new SwordMan("Indy", 2, 10, 5, "Gays");
        SwordMan person3 = new SwordMan("Andy", 1, 6, 9, null);
        SwordMan person4 = new SwordMan("Remy", 5, 10, 20, "null");

        Animal animal1 = new Animal("Slime", 1, 1, 5);
        Animal animal2 = new Animal("Pig", 2, 2, 6);
        Animal animal3 = new Animal("Fox", 3, 7, 6);
        Animal animal4 = new Animal("Sponge", 10, 13, 20);
        Animal animal5 = new Animal("Poring", 20, 50, 100);

        System.out.println("\nCommand-1");
        person1.whatIsYourName();
        System.out.println("\nCommand-2");
        person1.saySignatureQuote();
        System.out.println("\nCommand-3");
        person1.myLevelIs();
        System.out.println("\nCommand-4");
        person1.myHP();
        System.out.println("\nCommand-5");
        person1.whatIsAttack();
        System.out.println("\nCommand-6");
        person1.myLevelIs();
        System.out.println("\nCommand-7");
        person1.farm(animal1);
        System.out.println("\nCommand-8");
        person1.farm(animal1);
        System.out.println("\nCommand-9");
        person1.whatIsAttack();
        System.out.println("\nCommand-10");
        person1.attack(person4);
        System.out.println("\nCommand-11");
        person1.myLevelIs();
        System.out.println("\nCommand-12");
        person1.whatIsAttack();
        System.out.println("\nCommand-13");
        person1.farm(animal2);
        System.out.println("\nCommand-14");
        person1.whatIsAttack();
        System.out.println("\nCommand-15");
        person1.myHP();
        System.out.println("\nCommand-16");
        person1.farm(animal3);
        System.out.println("\nCommand-17");
        person1.farm(animal5);
        System.out.println("\nCommand-18");
        System.out.println();

        person2.whatIsYourName();
        person2.heal(10);
        person2.farm(animal4); 
        System.out.println();

        person3.whatIsYourName();
        person3.attack(person2);
        System.out.println(person3);
        System.out.println();
        System.out.println("========== END ==========");
    }

    static void demo2() {
        SwordMan kirito = new SwordMan("kirito", 99, 200, 1000, "Star burst stream!");
        SwordMan asuna = new SwordMan("Asuna", 99, 100, 500, "Kirito Kung");
        SwordMan heathCliff = new SwordMan("HeathCliff", 99, 200, 2000, "GGEZ");
        SwordMan suntana = new SwordMan("Suntana", 999, 999, 9999, "Ryoiki Tenkai!");

        kirito.whatIsYourName();
        kirito.saySignatureQuote();
        kirito.myHP();
        kirito.heal(200);
        kirito.myHP();
        kirito.myLevelIs();
        System.out.println(kirito.getLevel());
        System.out.println();

        asuna.whatIsYourName();
        asuna.saySignatureQuote();
        asuna.myHP();
        asuna.heal(200);
        asuna.myHP();
        asuna.myLevelIs();
        System.out.println(asuna.getLevel());
        System.out.println();

        heathCliff.whatIsYourName();
        heathCliff.saySignatureQuote();
        heathCliff.myHP();
        heathCliff.heal(200);
        heathCliff.myHP();
        heathCliff.myLevelIs();
        System.out.println(heathCliff.getLevel());
        System.out.println();

        suntana.whatIsYourName();
        suntana.saySignatureQuote();
        suntana.myHP();
        suntana.heal(200);
        suntana.myHP();
        suntana.myLevelIs();
        System.out.println(kirito.getLevel());
        System.out.println();

    }

    static void demo1() {
        Animal pig = new Animal("Pig", 2, 13, 20);
        Animal cow = new Animal("Cow", 1, 1, 5);
        Animal wolf = new Animal("Wolf", 10, 20, 10);

        pig.sayMyName();
        pig.killed();
        System.out.println(pig);
        System.out.println();

        cow.sayMyName();
        cow.doYouKnowMyLevel();
        cow.IamVeryStrong();
        cow.myHP();
        System.out.println(cow);
        System.out.println();

        wolf.sayMyName();
        wolf.myHP();
        System.out.println();
        System.out.println(wolf);
    }
}
