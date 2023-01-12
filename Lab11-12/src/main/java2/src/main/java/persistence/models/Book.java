package persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Books")

public class Book extends Section {


    @Setter
    String bt;

    @Setter
    @Getter
    @ManyToMany(cascade=CascadeType.ALL)
    //@NonNull
    private List<Author> authors;

    public Book(String Booktitle) {
        super(Booktitle);
        this.bt = Booktitle;
        this.authors = (new ArrayList<>());
    }

    public Book() {

    }


    public  String getBt() {
        return this.bt;
    }
    public  List<Author> getAuthors() {
        return this.authors;
    }

    public  void addAuthor( Author author) {

        this.authors.add(author);
    }

    public  void addContent(Element element) {
        super.add(element);
    }

    public void print() {


        for (Author author : this.authors) {
            String var3 = "Authors:";
            boolean var4 = false;
            System.out.println(var3);
            author.print();
        }

        super.print();
        super.print();
    }


}