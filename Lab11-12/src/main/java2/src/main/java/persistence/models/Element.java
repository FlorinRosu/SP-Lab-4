package persistence.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public interface Element {


    void add(Element var1);

    void remove(Element var1);

    void get(int var1);

    void accept( Visitor var1);

    void print();

}