package persistence.services;


import persistence.models.Book;
import persistence.models.Image;
import persistence.models.ImageProxy;
import persistence.models.Paragraph;
import persistence.models.Section;
import persistence.models.Table;
import persistence.models.TableOfContents;
import persistence.models.Visitor;



public final class TableOfContentsVisitor implements Visitor {
     
    private final TableOfContents tableOfContents = new TableOfContents();
    private int count = 1;

     
    public final TableOfContents getTableOfContents() {
        return this.tableOfContents;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int var1) {
        this.count = var1;
    }

     
    public final TableOfContents getToc() {
        return this.tableOfContents;
    }

    public void visitBook(  Book b) {

    }

    public void visitSection(  Section s) {

        this.tableOfContents.add(s.getTitle(), this.count);
    }

    public void visitTableOfContents(  TableOfContents toc) {

    }

    public void visitParagraph(  Paragraph p) {

        int var10001 = this.count++;
    }

    public void visitImageProxy(  ImageProxy ip) {

        int var10001 = this.count++;
    }

    public void visitImage(  Image i) {

        int var10001 = this.count++;
    }

    public void visitTable(  Table t) {

        int var10001 = this.count++;
    }
}
