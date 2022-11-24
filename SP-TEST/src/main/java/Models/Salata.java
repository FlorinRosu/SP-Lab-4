package Models;


public class Salata  implements Comanda, Vizitee{


    private final String Restaurnat;
    private final String Name;

    private Double cost = (double) 0;

    public Salata(String name, String Restaurant, Double cost) {


        this.Restaurnat = Restaurant;
        Name = name;


        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Salata{" +
                "Restaurnat='" + Restaurnat + '\'' +
                ", Name='" + Name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Salata " +this.Name);
    }

    @Override
    public void add(Comanda comanda) {

    }

    @Override
    public void remove(Comanda comanda) {

    }

    @Override
    public Comanda get(int i) {
        return null;
    }

    @Override
    public void accept(Vizitor vizitor) {
        vizitor.vizitSalata(this, this.cost);
    }

    @Override
    public Double getCostComanda() {
        return this.cost;
    }




}