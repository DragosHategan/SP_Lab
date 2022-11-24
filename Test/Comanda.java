import java.util.ArrayList;
import java.util.List;

public class Comanda implements Mancare {
    private String nume;
    private List<Mancare> mancaruri;

    public Comanda(String nume) {
        this.nume = nume;
        this.mancaruri = new ArrayList<>();
    }

    public void adaugaMancare(Mancare newMancare) {
        this.mancaruri.add(newMancare);
    }

    @Override
    public void print() {
        System.out.println("Comanda: " + this.nume);
        for (Mancare Mancare :
                this.mancaruri) {
            System.out.println();
            Mancare.print();
        }
    }

    @Override
    public void accept(Vizitator vizitator) {
        for (Mancare Mancare :
                this.mancaruri) {
            Mancare.accept(vizitator);
        }
    }
}
