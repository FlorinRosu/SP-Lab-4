package models;

public final class Table implements Element {
      
    private String t;

      
    public final String getT() {
        return this.t;
    }

    public final void setT(   String var1) {

        this.t = var1;
    }

    public void add(   Element e) {

    }

    public void remove(   Element e) {

    }

    public void get(int index) {
    }

    @Override
    public void accept(Visitor var1) {
        var1.visitTable(this);
    }

    public void print() {
        String var1 = "models.Table: " + this.t;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Table(   String table) {
        super();
        this.t = table;
    }
}
