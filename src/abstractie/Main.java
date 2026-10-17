package abstractie;

public class Main {
    public static void main(String[] args){
        Vehicul v1 = new Masina();
        Vehicul v2 = new Bicicleta();

        v1.porneste();
        v2.porneste();

        Animal a1 = new Elefant();
        Animal a2 = new Leu();

        a1.faceSunet();
        a2.faceSunet();
    }
}
