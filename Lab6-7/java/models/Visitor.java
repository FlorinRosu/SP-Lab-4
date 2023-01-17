package models;


public interface Visitor {
    void visitBook(  Book var1);

    void visitSection(  Section var1);

    void visitTableOfContents(  TableOfContents var1);

    void visitParagraph(  Paragraph var1);

    void visitImageProxy(  ImageProxy var1);

    void visitImage(  Image var1);

    void visitTable(  Table var1);


}