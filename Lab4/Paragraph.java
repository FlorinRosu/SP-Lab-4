
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

    public void print() {
        String var1 = "Paragraph: " + this.p;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Paragraph(   String paragraph) {

        super();
        this.p = paragraph;
    }
}