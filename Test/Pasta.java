public class Pasta implements Mancare {
    
    private String nume;
    private double pret;
    
    public Pasta(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
     }
    
    @Override
    public void print() {
        System.out.println("Pasta: " + this.nume);
        System.out.println("Pret: " + this.pret);
    }
    
    @Override
    public void accept(Vizitator vizitator) {
        vizitator.viziteazaPasta(this);
    }
    
    public double getPret() {
        return pret;
    }
}
