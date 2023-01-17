package models;

import java.util.ArrayList;
import java.util.List;

public final class TableOfContents implements Element {
    private final List<String> lista;

    public final void add(  String e, int page) {

        this.lista.add(e + " pag." + page);
    }

    public void print() {

        for (String o : this.lista) {
            String i = o;
            boolean var3 = false;
            System.out.println(i);
        }

    }

    public void accept(  Visitor v) {

        v.visitTableOfContents(this);
    }

    public TableOfContents() {
        boolean var1 = false;
        this.lista = (new ArrayList<String>());
    }

    public void add(  Element e) {

    }

    public void remove(  Element e) {

    }

    public void get(int index) {

    }
}
