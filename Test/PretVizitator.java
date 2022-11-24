public class PretVizitator implements Vizitator {
    private double pretSalata;
    private double pretPizza;
    private double pretPasta;

    public PretVizitator() {
        this.pretSalata = 0;
        this.pretPizza = 0;
        this.pretPasta = 0;
    }

    @Override
    public void viziteazaPizza(Pizza pizza) {
        this.pretPizza += pizza.getPret();
    }

    @Override
    public void viziteazaPasta(Pasta pasta) {
        this.pretPasta += pasta.getPret();
    }

    @Override
    public void viziteazaSalata(Salata Salata) {
        this.pretSalata += Salata.getPret();
    }

    public void individualDishPrices() {
        System.out.println("Pret Pizza: " + this.pretPizza);
        System.out.println("Pret Paste: " + this.pretPasta);
        System.out.println("Pret Salate: " + this.pretSalata);
    }

    public void pretTotal() {
        System.out.println("Pret Total: " + (this.pretSalata + this.pretPizza + this.pretPasta));
    }
}
