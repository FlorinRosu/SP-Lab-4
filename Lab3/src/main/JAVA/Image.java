
public final class Image implements Element {
       
    private String u;

       
    public final String getU() {
        return this.u;
    }

    public final void setU(    String var1) {
        this.u = var1;
    }

    public void add(    Element e) {

    }

    public void remove(    Element e) {

    }

    public void get(int index) {
    }

    public void print() {
        String var1 = "Image with name: " + this.u;
        System.out.println(var1);
    }

    public Image(    String url) {
        super();
        this.u = url;
    }
}
