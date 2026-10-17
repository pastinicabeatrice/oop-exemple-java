package oop;

public class Telefon {
    String marca;
    char model;
    float pret;
    String distribuitor;
    double memorie;

    public Telefon(String marca, char model, float pret, String distribuitor, double memorie) {
        this.marca = marca;
        this.model = model;
        this.pret = pret;
        this.distribuitor = distribuitor;
        this.memorie = memorie;
    }

    void afiseazaDetalii(){
        System.out.println("Acest telefon este marca "+marca+ " modelul "+model+" are o memorie de "+memorie+" GB si este vandut la pretul de "+pret+" de catre furnizorul "+distribuitor);
    }
}
