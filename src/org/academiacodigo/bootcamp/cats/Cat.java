package org.academiacodigo.bootcamp.cats;

public class Cat {
    private String breed;
    private String color;
    private String name;
    private int age;

    public Cat(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public void introduceCat() {
             System.out.println("Alo aloo, my name is " + name + " , it means moon " +
                     "in Japanese. my color is " + color +" and Im " + breed + "." +
                     " I'm a little kitty, I only have " + age + " months of life. " +
                     "I LOVE MILK!");
    }

    public void angry(boolean isAngry) {
        if(isAngry) {
            System.out.println("GRRRR, IM MAD!");
        } else {
            System.out.println("purrrr, thanks for the love :3");
        }
    }
    public void happy(boolean isHappy) {
        if(isHappy){
        System.out.println("Meow, meow, meow, im sho happy =^.^=");
    } else {
            System.out.println("meow :( meow :(, pwease... play with me");
        }
    }
    public void hungry(boolean isHungry) {
        if(isHungry) {
            System.out.println("meow, food! give me good food!");
        } else {
            System.out.println("I love playing with cables =^.^=");
        }
    }


}

