package persistence.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@javax.persistence.Table(name = "taable")
@NoArgsConstructor(force = true)
public  class Table implements Element {
    @Id
    @GeneratedValue
    private int id;

    private String t;

      
    public  String getT() {
        return this.t;
    }

    public  void setT(   String var1) {

        this.t = var1;
    }

    public void add(   Element e) {

    }

    public void remove(   Element e) {

    }

    public void get(int index) {
    }

    @Override
    public void accept(Visitor var1) {
        var1.visitTable(this);
    }

    public void print() {
        String var1 = "models.Table: " + this.t;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Table(   String table) {
        super();
        this.t = table;
    }
}
