package n1exercici1;

public abstract class Instruments {

    private String nom;
    private int preu;

    public Instruments (String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    {
        System.out.println("Bloc d'inicializació.");
    }

    static {
        System.out.println("Bloc estàtic");
    }

    public String getNom () {
        return this.nom;
    }
    public int getPreu() {
        return this.preu;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPreu (int preu) {
        this.preu = preu;
    }

    public static void metodeEstatic () {
        System.out.println("Mètode estàtic.");
    }

    @Override
	public String toString() {
		return "Instrument: " + this.nom + " Preu: " + this.preu;
	}

    abstract void tocar();
}
