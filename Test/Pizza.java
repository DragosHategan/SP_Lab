public class Pizza implements Mancare {
    
    private String nume;
    private double pret;
    
    public Pizza(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
     }
    
    @Override
    public void print() {
        System.out.println("Pizza: " + this.nume);
        System.out.println("Pret: " + this.pret);
    }
    
    @Override
    public void accept(Vizitator vizitator) {
        vizitator.viziteazaPizza(this);
    }
    
    public double getPret() {
        return pret;
    }
}
