public class Main {
    public static void main(String[] args) {
        
        Comanda comanda = new Comanda("comanda");
        
        Comanda trattoria = new Comanda("Trattoria");
        Comanda mcDonalds = new Comanda("McDonalds");
        Comanda sabres = new Comanda("Sabres");
        
        Salata caesar = new Salata("caesar", 22);
        Pizza prosciuttoFunghi = new Pizza("prosciuttoFunghi", 34);
        Pizza diavola = new Pizza("Diavola", 38);
        Pizza bigMac = new Pizza("Big Mac", 12);
        Pasta bolognese = new Pasta("bolognese", 27);

        mcDonalds.adaugaMancare(prosciuttoFunghi);
        mcDonalds.adaugaMancare(diavola);

        trattoria.adaugaMancare(bigMac);
        mcDonalds.adaugaMancare(trattoria);

        sabres.adaugaMancare(diavola);

        trattoria.adaugaMancare(bolognese);
        trattoria.adaugaMancare(prosciuttoFunghi);
        trattoria.adaugaMancare(caesar);

        comanda.adaugaMancare(mcDonalds);
        comanda.adaugaMancare(sabres);

        comanda.print();

        PretVizitator vizitator = new PretVizitator();
        comanda.accept(vizitator);
        vizitator.individualDishPrices();
        System.out.println();
        vizitator.pretTotal();
    }
}
