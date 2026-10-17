package basicStuf;

public class program1 {
   private String nume;
    private String hooby;
    private int varsta;
    public double media;

    public program1(String nume, String hooby, int varsta) {
        this.nume = nume;
        this.hooby = hooby;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getHooby() {
        return hooby;
    }

    public void setHooby(String hooby) {
        this.hooby = hooby;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public float calculeazaMedia(int a, int b){
        this.media= (double) (a+b)/2;
        return (float) this.media;
    }
}
