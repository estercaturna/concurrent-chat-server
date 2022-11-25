package org.academiacodigo.bootcamp.cats;

public class Playground {

    public static void main(String[] args) {

        Cat myFirstCat = new Cat("Tsuki", "gray", "British", 3);

        myFirstCat.happy(true);
        myFirstCat.hungry(true);
        myFirstCat.hungry(false);
        myFirstCat.angry(true);
        myFirstCat.angry(false);
        myFirstCat.happy(false);
        myFirstCat.introduceCat();
    }


}
