package oop;

public  class Animal {
    void faceSunet(){
        System.out.println("Animalul scoate un sunet.");
    }
}

class Caine extends Animal{
    void latra(){
        System.out.println("Cainele latra: Ham!");
    }
}

class Pisica extends Animal {
    void miau() {
        System.out.println("Pisica face miau!");
    }
}

    class Hamster extends Animal{
        @Override
        void faceSunet(){
            System.out.println("Hamsterul scoate sunete!");
    }
}

