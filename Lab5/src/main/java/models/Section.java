package models;

import java.util.ArrayList;
import java.util.List;



public class Section implements Element {
     
    private String t;
     
    private final List<Element> elements;
    public final String getT() {
        return this.t;
    }

    public final void setT(  String var1) {
        this.t = var1;
    }

     
    public final List<Element> getElements() {
        return this.elements;
    }

    public void add(  Element e) {

        this.elements.add(e);
    }

    public void remove(  Element e) {

    }

    public void get(int index) {
    }

     
    public final String getTitle() {
        return this.t;
    }

    public void print() {
        String var1 = this.t;
        boolean var2 = false;
        System.out.println(var1);

        for (Element element : this.elements) {
            Element el = element;
            el.print();
        }

    }

    public void accept(  Visitor v) {

        v.visitSection(this);

        for (Element element : this.elements) {
            Element e = element;
            e.accept(v);
        }

    }

    public Section(  String title) {

        super();
        this.t = title;
        boolean var2 = false;
        this.elements = new ArrayList<Element>();
    }
}