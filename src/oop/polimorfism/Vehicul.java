package oop.polimorfism;

public class Vehicul {
    void porneste() {
        System.out.println("Vehicul a pornit.");
    }
}

 class Masina extends Vehicul{
 @Override
     void porneste(){
     System.out.println("Masina a pornit");
 }
}

class Bicicleta extends Vehicul{
    @Override
    void porneste(){
        System.out.println("Bicicleta nu poate porni, nu este masina!");
    }
}
