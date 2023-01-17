package models;

public final class Paragraph implements Element {
      
    private String p;

      
    public final String getP() {
        return this.p;
    }

    public final void setP(   String var1) {

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