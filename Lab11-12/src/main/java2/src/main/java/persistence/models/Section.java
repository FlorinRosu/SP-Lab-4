package persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@Table(name = "Section")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Section implements Element {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter
    @Setter
    private int section_id;


    private String section_name;


    //@NonNull
    @OneToMany(targetEntity= Paragraph.class,cascade=CascadeType.ALL)
    @JoinTable(name="Section")
    @MapKeyColumn(name="id")
    private  List<Element> elements;

    public  String getT() {
        return this.section_name;
    }

    public void setT(  String var1) {
        this.section_name = var1;
    }

     
    public List<Element> getElements() {
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
        return this.section_name;
    }

    public void print() {
        String var1 = this.section_name;
        boolean var2 = false;
        System.out.println(var1);

        for (Element element : this.elements) {
            element.print();
        }

    }

    public void accept(  Visitor v) {

        v.visitSection(this);

        for (Element element : this.elements) {
            element.accept(v);
        }

    }

    public Section(  String title) {

        super();
        this.section_name = title;
        boolean var2 = false;
        this.elements = new ArrayList<Element>();
    }
}