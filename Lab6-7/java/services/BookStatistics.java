package services;


import models.Book;
import models.Image;
import models.ImageProxy;
import models.Paragraph;
import models.Section;
import models.Table;
import models.TableOfContents;
import models.Visitor;


public final class BookStatistics implements Visitor {

    private final AlignmentStrategyFactory aligmentStrategyFactory = new AlignmentStrategyFactory("");
    private int bookIncrement;
    private int sectionIncrement;
    private int tocIncrement;
    private int paragraphIncrement;
    private int imageProxyIncrement;
    private int imageIncrement;
    private int tableIncrement;


    public final AlignmentStrategyFactory getAligmentStrategyFactory() {
        return this.aligmentStrategyFactory;
    }

    public final int getBookIncrement() {
        return this.bookIncrement;
    }

    public final void setBookIncrement(int var1) {
        this.bookIncrement = var1;
    }

    public final int getSectionIncrement() {
        return this.sectionIncrement;
    }

    public final void setSectionIncrement(int var1) {
        this.sectionIncrement = var1;
    }

    public final int getTocIncrement() {
        return this.tocIncrement;
    }

    public final void setTocIncrement(int var1) {
        this.tocIncrement = var1;
    }

    public final int getParagraphIncrement() {
        return this.paragraphIncrement;
    }

    public final void setParagraphIncrement(int var1) {
        this.paragraphIncrement = var1;
    }

    public final int getImageProxyIncrement() {
        return this.imageProxyIncrement;
    }

    public final void setImageProxyIncrement(int var1) {
        this.imageProxyIncrement = var1;
    }

    public final int getImageIncrement() {
        return this.imageIncrement;
    }

    public final void setImageIncrement(int var1) {
        this.imageIncrement = var1;
    }

    public final int getTableIncrement() {
        return this.tableIncrement;
    }

    public final void setTableIncrement(int var1) {
        this.tableIncrement = var1;
    }

    public void visitBook(  Book b) {

        String var2 = b.getBt();
        boolean var3 = false;
        System.out.print(var2);
        int var10001 = this.bookIncrement++;
    }

    public void visitSection(  Section s) {

        int var10001 = this.sectionIncrement++;
    }

    public void visitTableOfContents(  TableOfContents toc) {

        int var10001 = this.tocIncrement++;
    }

    public void visitParagraph(  Paragraph p) {

        int var10001 = this.paragraphIncrement++;
    }

    public void visitImageProxy(  ImageProxy ip) {

        int var10001 = this.imageProxyIncrement++;
    }

    public void visitImage(  Image i) {

        int var10001 = this.imageIncrement++;
    }

    public void visitTable(  Table t) {

        int var10001 = this.tableIncrement++;
    }

    public final void printStatistics() {
        String var1 = "Book Statistics: ";
        boolean var2 = false;
        System.out.println(var1);
        var1 = "*** Number of images: " + this.imageIncrement;
        System.out.println(var1);
        var1 = "*** Number of tables: " + this.tableIncrement;
        System.out.println(var1);
        var1 = "*** Number of paragraphs: " + this.paragraphIncrement;
        System.out.println(var1);
    }
}