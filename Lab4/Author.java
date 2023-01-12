import org.jetbrains.annotations.NotNull;

public final class Author {

    private String name;
    public final String getName() {
        return this.name;
    }

    public final void setName(  String var1) {
        this.name = var1;
    }

    public final void print() {
        String var1 = "Author: " + this.name;
        boolean var2 = false;
        System.out.println(var1);
    }

    public Author(  String s) {
        super();
        this.name = s;
    }
}
