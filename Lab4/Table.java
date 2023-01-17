
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

    public void print() {
        String var1 = "Table: " + this.t;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Table(   String table) {
        super();
        this.t = table;
    }
}
