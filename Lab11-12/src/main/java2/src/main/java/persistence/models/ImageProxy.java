package persistence.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;



public class ImageProxy implements Element, Picture {


    private final Image image;
    private final List<Element> elements;

      
    public final Image getImage() {
        return this.image;
    }

    public final List<Element> getElements() {
        return this.elements;
    }

    public void add(   Element e) {

        this.elements.add(e);
    }

    public void remove(   Element e) {

    }

    public void get(int index) {
    }

    @Override
    public void accept(Visitor var1) {
        var1.visitImageProxy(this);
    }

    public void print() {

        for (Element element : this.elements) {
            element.print();
        }

    }

    public final void loadImage() {
    }

    public ImageProxy(   String url) {
        super();
        this.image = new Image(url);
        boolean var2 = false;
        this.elements = (new ArrayList<>());
    }

    public void url() {

    }

    public void dim() {

    }

    public void content() {

    }
}
