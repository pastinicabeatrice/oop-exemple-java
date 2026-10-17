package oop;

public class Student {
    private String nume;
    private float nota;

    public Student(String nume, float nota){
        this.nume=nume;
        this.nota=nota;
    }

    public float getNota(){
        return nota;
    }

    public String getNume(){
        return nume;
    }

    public void introduNota(float notaStudent){
        if(notaStudent>=1 && notaStudent <=10){
            this.nota=notaStudent;
        }else{
            System.out.println("Nota invalida! Introdu o nota intre 1 si 10");
        }
    }


}
