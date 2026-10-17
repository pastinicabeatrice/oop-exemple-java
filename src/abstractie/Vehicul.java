package abstractie;
abstract class Vehicul {
    abstract void porneste();

    void opreste(){
        System.out.println("Vehiculul s-a oprit.");
    }
}

class Masina extends Vehicul{
    @Override
    void porneste(){
        System.out.println("Masina porneste cu cheia.");
    }
}

class Bicicleta extends Vehicul{
    @Override
    void porneste(){
        System.out.println("Bicicleta porneste pedaland.");
    }
}