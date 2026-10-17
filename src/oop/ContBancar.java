package oop;

public class ContBancar{
    private double sold;

    public ContBancar(double soldInitial){
        this.sold=soldInitial;
    }

    public double getSold(){
        return sold;
    }

    public void depuneBani(double suma){
        sold+=suma;
    }

    public void retrageBani(double suma){
        if(suma>sold){
            System.out.println("Fonduri insuficiente");
        } else{
            sold -=suma;
            System.out.println("Ai retras: "+suma+". Sold actual: "+sold);
        }
    }
}
