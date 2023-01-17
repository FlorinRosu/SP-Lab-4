package models;

public interface Element {
    void add(Element var1);

    void remove(Element var1);

    void get(int var1);

    void accept( Visitor var1);

    void print();

}