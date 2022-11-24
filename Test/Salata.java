public class Salata implements Mancare {
    
    private String nume;
    private double pret;

    public Salata(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void print() {
        System.out.println("Salata: " + this.nume);
        System.out.println("Pret: " + this.pret);
    }

    @Override
    public void accept(Vizitator vizitator) {
        vizitator.viziteazaSalata(this);
    }

    public double getPret() {
        return pret;
    }
}
