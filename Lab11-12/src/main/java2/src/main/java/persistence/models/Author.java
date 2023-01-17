package persistence.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Authors")
@NoArgsConstructor(force = true)

public  class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    private String name;
    public  String getName() {
        return this.name;
    }

    public  void setName(  String var1) {
        this.name = var1;
    }

    public  void print() {
        String var1 = "models.Author: " + this.name;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Author(  String s) {
        super();
        this.name = s;
    }
}
