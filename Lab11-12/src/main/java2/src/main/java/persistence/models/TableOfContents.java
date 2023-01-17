package persistence.models;

import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;
@Entity
@NoArgsConstructor(force = true)
public class TableOfContents implements Element {

    @Id
    @GeneratedValue
    private int id;

    @ElementCollection
    @NonNull
    private List<String> lista;

    public  void add(  String e, int page) {

        this.lista.add(e + " pag." + page);
    }

    public void print() {

        for (String o : this.lista) {
            boolean var3 = false;
            System.out.println(o);
        }

    }

    public void accept(  Visitor v) {

        v.visitTableOfContents(this);
    }

    public void add(  Element e) {

    }

    public void remove(  Element e) {

    }

    public void get(int index) {

    }
}
