package models;

import java.util.ArrayList;
import java.util.List;


public class Image implements Element, Picture {
     
    private String u;
     
    private final List<Element> elements;

     
    public final String getU() {
        return this.u;
    }

    public final void setU(  String var1) {
        this.u = var1;
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

    @Override
    public void accept(Visitor var1) {
        var1.visitImage(this);
    }

    public void url() {
    }

    public void dim() {
    }

    public void content() {
    }

    public void print() {
        String var1 = "models.Image with name: " + this.u;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Image(  String url) {
        super();
        this.u = url;
        boolean var2 = false;
        this.elements = new ArrayList<Element>();
    }
}
