package models;


public interface Visitor {
    void visitBook(  Book var1);

    void visitSection(  Section var1);

    void visitTableOfContents(  TableOfContents var1);

    void visitParagraph(  Paragraph var1);

    void visitImageProxy(  ImageProxy var1);

    void visitImage(  Image var1);

    void visitTable(  Table var1);

    public static final class DefaultImpls {
        public static void visitBook(  Visitor $this,   Book b) {

        }

        public static void visitSection(  Visitor $this,   Section s) {

        }

        public static void visitTableOfContents(  Visitor $this,   TableOfContents toc) {

        }

        public static void visitParagraph(  Visitor $this,   Paragraph p) {

        }

        public static void visitImageProxy(  Visitor $this,   ImageProxy ip) {

        }

        public static void visitImage(  Visitor $this,   Image i) {

        }

        public static void visitTable(  Visitor $this,   Table t) {

        }
    }
}