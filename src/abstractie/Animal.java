package abstractie;

abstract class Animal {
   abstract void faceSunet();
}

 class Leu extends Animal{
    @Override
    void faceSunet(){
        System.out.println("Leul rage.");
    }
}

class Elefant extends Animal{
    @Override
    void faceSunet(){
        System.out.println("Elefantul face sunet");
    }
}