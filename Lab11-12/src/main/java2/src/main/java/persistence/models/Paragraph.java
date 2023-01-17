package persistence.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(force = true)
public  class Paragraph implements Element {
    @Id
    @GeneratedValue
    private int id;

    private String p;


      
    public  String getP() {
        return this.p;
    }

    public  void setP(   String var1) {

        this.p = var1;
    }

    public void add(   Element e) {

    }

    public void remove(   Element e) {

    }

    public void get(int index) {
    }

    @Override
    public void accept(Visitor var1) {
        var1.visitParagraph(this);
    }

    public void print() {
        String var1 = "models.Paragraph: " + this.p;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Paragraph(   String paragraph) {

        super();
        this.p = paragraph;
    }
}